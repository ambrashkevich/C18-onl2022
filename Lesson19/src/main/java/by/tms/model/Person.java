package by.tms.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private String surName;
    private int age;

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
}
