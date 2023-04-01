package by.tms.model;

import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
