package by.tms.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    private String number;
    private int year;

    public Car(String number, int year) {
        this.number = number;
        this.year = year;
    }
}
