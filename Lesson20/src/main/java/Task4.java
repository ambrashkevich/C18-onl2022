import by.tms.model.Category;
import by.tms.model.Product;

import java.util.Comparator;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        //  4) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        //         Создать класс Категория, имеющий переменные имя и множество товаров.
        //         Создать несколько объектов класса Категория.
        //         Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
        //        Используем классы компараторы для каждого вида сортировки.
        Category category = new Category("Electronics", Set.of(new Product("Видеокарта", 900, 5),
                new Product("Клавиатура", 300, 4),
                new Product("Монитор", 200, 3),
                new Product("Мышь", 100, 1),
                new Product("Процессор", 600, 2)));
        printByCost(category);
        System.out.println("--------------------");
        printByName(category);
        System.out.println("--------------------");
        printByRating(category);
    }

    private static void printByCost(Category category) {
        category.getProductSet()
                .stream()
//                .sorted(Comparator.comparing(Product::getCost))
                .sorted(new Product.ProductCostComparator())
                .forEach(System.out::println);
    }

    private static void printByName(Category category) {
        category.getProductSet()
                .stream()
                .sorted(Comparator.comparing(Product::getName))
                .forEach(System.out::println);
    }

    private static void printByRating(Category category) {
        category.getProductSet()
                .stream()
                .sorted(Comparator.comparing(Product::getRating))
                .forEach(System.out::println);
    }
}
