package eshop.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Product {

    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageName;

}
