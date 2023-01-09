package by.tms.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@Setter
public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public boolean add(Product product) {
        return getProducts().add(product);

    }

    public void delete(long id) {
        Iterator<Product> iterator = getProducts().iterator();
        while (iterator.hasNext()) {
            Product productFromDelete = iterator.next();
            if (id == productFromDelete.getId()) {
                iterator.remove();
                break;
            }
        }
    }


    public void editProduct(Product pr) {
        products.remove(products.size() - 1);
        products.add(products.size(), pr);
    }

    public List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<>();
        }
        return products;
    }
}
