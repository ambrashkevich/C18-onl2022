package by.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
public class Category {
    private String nameCategory;
    private Set<Product> productSet;

    public Category(String nameCategory, Set<Product> productSet) {
        this.nameCategory = nameCategory;
        this.productSet = productSet;
    }
}
