package loginform.service;

import java.util.List;
import loginform.model.Product;

public interface ProductService {

    List<Product> getProducts();

    List<Product> getProductsById(int id);

    Product getProductById(int id);
}
