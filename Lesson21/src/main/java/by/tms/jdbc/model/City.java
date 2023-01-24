package by.tms.jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class City {
    private Integer id;
    private String name;
    private String info;

    public City(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public City(String name) {
        this.name = name;
    }
}
