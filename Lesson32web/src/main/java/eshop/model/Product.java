package eshop.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Product {

    private int id;
    private String imageName;
    private String name;
    private String description;
    private BigDecimal price;
    private int categoryId;
}
