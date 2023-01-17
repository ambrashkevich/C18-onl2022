package by.tms.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Toy {
    private String name;
    private int cost;

    public Toy(String name, int cost) {
        this.name = name;
        this.cost = cost;

    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
