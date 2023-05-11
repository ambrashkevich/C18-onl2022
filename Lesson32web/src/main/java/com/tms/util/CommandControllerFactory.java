package com.tms.util;

import static com.tms.util.InjectObjectsFactory.createAndInjectInstances;

import com.tms.controller.BaseCommandController;
import com.tms.controller.CategoryController;
import com.tms.controller.HomeController;
import com.tms.controller.LogoutController;
import com.tms.controller.ProductController;
import com.tms.model.Command;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CommandControllerFactory {

    private static final Map<String, BaseCommandController> COMMANDS = new ConcurrentHashMap<>();

    public static BaseCommandController defineCommand(Command command) throws Exception {
        return putIfAbsent(command.getCommand(), createController(command));
    }

    private static Supplier<BaseCommandController> createController(Command command) {
        return switch (command) {
            case LOGOUT_COMMAND -> LogoutController::new;
            case PRODUCT_COMMAND -> ProductController::new;
            case CATEGORY_COMMAND -> CategoryController::new;
//            case PROFILE_COMMAND -> ProfileController::new;
//            case SHOPPING_CART_POST_COMMAND -> CartPostController::new;
//
            case HOME_COMMAND -> HomeController::new;
        };
    }

    private static BaseCommandController putIfAbsent(String key, Supplier<BaseCommandController> supplier) throws Exception {
        BaseCommandController value = COMMANDS.get(key);
        if (value == null) {
            value = create(supplier);
            COMMANDS.put(key, value);
        }
        return value;
    }

    private static BaseCommandController create(Supplier<BaseCommandController> supplier) throws Exception {
        BaseCommandController baseController = supplier.get();
        createAndInjectInstances(baseController);
        return baseController;
    }
}
