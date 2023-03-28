package by.tms.task3.model;

import static by.tms.task3.model.FruitType.APPLE;

import lombok.Getter;

@Getter
public class Apple extends Fruit {

    public Apple(double weight, double price) {
        super(weight, price);
    }

    @Override
    public FruitType getType() {
        return APPLE;
    }
}
