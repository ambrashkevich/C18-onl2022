package by.tms.shop.util;

import by.tms.shop.model.Category;
import java.util.List;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CategoryHelper {

    public static final List<Category> categories = List.of(
            new Category(1, "Mobile phones", "mobile.jpeg"),
            new Category(2, "Laptops", "laptop.jpeg"),
            new Category(3, "GPS Navigators", "jps_nav.jpeg"),
            new Category(4, "Fridges", "fridge.jpeg"),
            new Category(5, "Cars", "car.jpeg"),
            new Category(6, "Cameras", "camera.jpeg"));
}
