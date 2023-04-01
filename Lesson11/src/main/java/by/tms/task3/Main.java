package by.tms.task3;

import static by.tms.task3.model.FruitType.APPLE;
import static by.tms.task3.model.FruitType.APRICOT;
import static by.tms.task3.model.FruitType.PEAR;

import by.tms.task3.model.Apple;
import by.tms.task3.model.Apricot;
import by.tms.task3.model.Fruit;
import by.tms.task3.model.FruitType;
import by.tms.task3.model.Pear;

/**
 * Задача3
 * Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
 * Класс Фрукт содержит:
 * а) переменную вес,
 * б) метод printManufacturerInfo(){System.out.print("Made in Belarus");} который нельзя изменить в наследнике.
 * в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
 * Метод должен учитывать вес фрукта(Т.е в зависимости от веса разная цена)
 * Создать несколько объектов разных классов.
 * Подсчитать общую стоимость проданных фруктов.
 * А также общую стоимость отдельно проданных яблок, груш и абрикос.
 */
public class Main {

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[9];
        fruits[0] = new Apple(10, 0.11);
        fruits[1] = new Apple(10, 0.12);
        fruits[2] = new Apple(10, 0.14);
        fruits[3] = new Pear(12, 0.25);
        fruits[4] = new Pear(12, 0.22);
        fruits[5] = new Pear(12, 0.12);
        fruits[6] = new Apricot(25, 0.03);
        fruits[7] = new Apricot(25, 0.15);
        fruits[8] = new Apricot(25, 0.11);
        System.out.println("Продано всего" + " " + calculateTotal(fruits));
        System.out.println("Продано яблок" + " " + calculateTotalPriceFruits(fruits, APPLE));
        System.out.println("Продано груш" + " " + calculateTotalPriceFruits(fruits, PEAR));
        System.out.println("Продано абрикосов" + " " + calculateTotalPriceFruits(fruits, APRICOT));

    }

    public static double calculateTotal(Fruit[] fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            sum += fruit.getPrice();
        }
        return sum;
    }

    public static double calculateTotalPriceFruits(Fruit[] fruits, FruitType type) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            if (fruit.getType() == type) {
                sum += fruit.getPrice();
            }
        }
        return sum;
    }
}
