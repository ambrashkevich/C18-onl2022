package by.tms.jdbc.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class City {

    private Integer id;
    private String nameCity;
    private String description;

    public City(Integer id, String nameCity, String description) {
        this.id = id;
        this.nameCity = nameCity;
        this.description = description;
    }

    public City(String nameCity) {
        this.nameCity = nameCity;
    }
}
