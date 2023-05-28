package com.tms.repository.impl;



import com.tms.model.Product;
import com.tms.repository.ProductRepository;
import com.tms.util.ProductHelper;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public List<Product> getProducts() {
        return ProductHelper.products;
    }

    @Override
    public Product getProductById(int id) {
        return ProductHelper.products.stream()
                                     .filter(product -> product.getId() == id)
                                     .findFirst()
                                     .orElse(null);
    }

    @Override
    public List<Product> getProductsByCategoryId(int categoryId) {
        return ProductHelper.products.stream()
                                     .filter(product -> product.getCategoryId() == categoryId)
                                     .toList();
    }
}