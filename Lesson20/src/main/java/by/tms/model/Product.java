package by.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;

@Getter
@Setter
@ToString
public class Product {
    private String name;
    private int cost;
    private int rating;

    public Product(String name, int cost, int rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public static class ProductCostComparator implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getCost() - o2.getCost();
        }
    }
}
