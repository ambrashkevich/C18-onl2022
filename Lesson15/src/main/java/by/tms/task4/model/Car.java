package by.tms.task4.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Car implements Serializable {
    private String brand;
    private final Engine engine;
    private final GasTank gasTank;
    private int maxSpeed;
    private int price;

    public Car(String brand, Engine engine, GasTank gasTank, int maxSpeed, int price) {
        this.brand = brand;
        this.engine = engine;
        this.gasTank = gasTank;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
}


