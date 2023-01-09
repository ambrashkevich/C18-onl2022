package by.tms.task2.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Animal implements Serializable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
}
