package by.tms.task3.model;

import lombok.Getter;

import static by.tms.task3.model.FruitType.PEAR;

@Getter
public class Pear extends Fruit {
    public Pear(double weight, double price) {
        super(weight, price);
    }

    @Override
    public FruitType getType() {
        return PEAR;
    }
}
