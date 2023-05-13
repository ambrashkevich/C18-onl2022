package com.tms.util;

import com.tms.model.Inject;
import com.tms.repository.CategoryRepository;
import com.tms.repository.ProductRepository;
import com.tms.repository.impl.JdbcCategoryRepository;
import com.tms.repository.impl.ProductRepositoryImpl;
import com.tms.service.CategoryService;
import com.tms.service.CategoryServiceImpl;
import com.tms.service.ProductService;
import com.tms.service.ProductServiceImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.experimental.UtilityClass;

@UtilityClass
public class InjectObjectsFactory {

    private static final Map<Class<?>, Object> CLASS_OBJECT_MAP = new ConcurrentHashMap<>();

//    public static <T> void createServices(Object controller) throws IllegalAccessException {
//        for (Field field : controller.getClass().getDeclaredFields()) {
//            Inject fieldInject = field.getAnnotation(Inject.class);
//            if (fieldInject != null) {
//                Object service = putIfAbsent(field.getType());
//                field.setAccessible(true);
//                field.set(controller, service);
//            }
//        }
//    }

    public static void createAndInjectInstances(Object controller) throws Exception {
        for (Field field : controller.getClass().getDeclaredFields()) {
            Inject fieldInject = field.getAnnotation(Inject.class);
            if (fieldInject != null) {
                Object service = putInstanceToMapIfAbsent(field.getType());
                Method injectMethod = getInjectMethod(controller, field.getType());
                injectMethod.invoke(controller, service);
                createAndInjectInstances(service);//проблема зацикливания может быть
            }
        }
    }

    private static Method getInjectMethod(Object controller, Class<?> type) {
        for (Method declaredMethod : controller.getClass().getDeclaredMethods()) {
            boolean allMatch = Arrays.stream(declaredMethod.getParameterTypes())
                                     .allMatch(methodParameterTypeClass -> methodParameterTypeClass == type
                                             && declaredMethod.getReturnType() == Void.TYPE
                                             && declaredMethod.getName().startsWith("set"));
            if (allMatch) {
                return declaredMethod;
            }
        }
        throw new IllegalArgumentException("Can not find method with param " + type);
    }

    private static <T> Object putInstanceToMapIfAbsent(Class<T> serviceClass) {
        Object value = CLASS_OBJECT_MAP.get(serviceClass);
        if (value == null) {
            value = createInstance(serviceClass);
            CLASS_OBJECT_MAP.put(serviceClass, value);
        }
        return value;
    }

    private static <T> Object createInstance(Class<T> serviceClass) {
        if (CategoryService.class == serviceClass) {
            return new CategoryServiceImpl();
        } else if (CategoryRepository.class == serviceClass) {
            return new JdbcCategoryRepository();
        } else if (ProductService.class == serviceClass) {
            return new ProductServiceImpl();
        } else if (ProductRepository.class == serviceClass) {
            return new ProductRepositoryImpl();
        }
        throw new IllegalArgumentException("Can not create instance of class " + serviceClass);
    }
}