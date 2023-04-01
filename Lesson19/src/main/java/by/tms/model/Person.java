package by.tms.model;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {

    private String name;
    private String surName;
    private int age;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return Objects.equals(name, person.name) && Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}

