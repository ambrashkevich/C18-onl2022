package by.tms.task2;

import by.tms.task2.model.Atelier;
import by.tms.task2.model.Clothing;
import by.tms.task2.model.ClothingType;
import by.tms.task2.model.Pants;
import by.tms.task2.model.Size;
import by.tms.task2.model.Skirt;
import by.tms.task2.model.Tie;
import by.tms.task2.model.Tshirt;

public class Main {

    public static void main(String[] args) {
/**
 Задача2: Одежда
 1) Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L).
 Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
 Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
 Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40), соответствующее каждому размеру.
 Создать конструктор, принимающий на вход euroSize.
 2) Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
 3) Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
 4) Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
 Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Юбка (реализует интерфейсы "Женская Одежда"),
 Галстук (реализует интерфейсы "Мужская Одежда").
 5) Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину,
 одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды.
 Метод одетьЖенщину выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.
 */
        Clothing[] clothing = new Clothing[4];
        clothing[0] = createClothes(ClothingType.TSHIRT, Size.XS, "оранжевый", 30);
        clothing[1] = createClothes(ClothingType.PANTS, Size.L, "белый", 50);
        clothing[2] = createClothes(ClothingType.SKIRT, Size.S, "синий", 10);
        clothing[3] = createClothes(ClothingType.TIE, Size.M, "черный", 20);
        Atelier atelier = new Atelier(clothing);
        atelier.dressMan();
        atelier.dressWomen();
    }

    private static Clothing createClothes(ClothingType type, Size size, String color, int price) {
        ClothingType clothingType;
        switch (type) {
            case TSHIRT: {
                return Tshirt.builder()
                             .size(size)
                             .color(color)
                             .price(price)
                             .build();
            }
            case PANTS: {
                return Pants.builder()
                            .size(size)
                            .color(color)
                            .price(price)
                            .build();
            }
            case SKIRT: {
                return Skirt.builder()
                            .size(size)
                            .color(color)
                            .price(price)
                            .build();
            }
            case TIE: {
                return Tie.builder()
                          .size(size)
                          .color(color)
                          .price(price)
                          .build();
            }
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}



