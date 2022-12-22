package by.tms.task2.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Tshirt extends Clothing implements IMensClothing, IWomensClothing {
    public static Clothing builder;

    public Tshirt(Size size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеть мужскую футболку. Размер: " + getSize() + ", цвет: " + getColor() + ", цена: " + getPrice());
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеть женскую футболку. Размер: " + getSize() + ", цвет: " + getColor() + ", цена: " + getPrice());
    }
}
