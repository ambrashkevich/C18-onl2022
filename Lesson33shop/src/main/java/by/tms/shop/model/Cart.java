package by.tms.shop.model;

import java.io.Serializable;
import java.util.List;

public class Cart implements Serializable {

    private List<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }
}
