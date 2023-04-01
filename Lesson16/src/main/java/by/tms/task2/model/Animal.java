package by.tms.task2.model;

import java.io.Serializable;
import lombok.ToString;

@ToString
public class Animal implements Serializable {

    private String name;

    public Animal(String name) {
        this.name = name;
    }
}
