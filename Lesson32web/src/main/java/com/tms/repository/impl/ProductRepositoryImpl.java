package com.tms.repository.impl;

import static com.tms.util.ProductHelper.products;

import com.tms.model.Product;
import com.tms.repository.ProductRepository;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Product getProductById(int id) {
        return products.stream()
                       .filter(product -> product.getId() == id)
                       .findFirst()
                       .orElse(null);
    }

    @Override
    public List<Product> getProductsByCategoryId(int categoryId) {
        return products.stream()
                       .filter(product -> product.getCategoryId() == categoryId)
                       .toList();
    }
}