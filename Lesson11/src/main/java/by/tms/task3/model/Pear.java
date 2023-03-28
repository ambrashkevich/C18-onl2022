package by.tms.task3.model;

import static by.tms.task3.model.FruitType.PEAR;

import lombok.Getter;

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
