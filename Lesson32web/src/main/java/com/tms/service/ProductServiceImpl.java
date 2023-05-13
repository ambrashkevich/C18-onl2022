package com.tms.service;

import com.tms.model.Inject;
import com.tms.model.Product;
import com.tms.repository.ProductRepository;
import java.util.List;
import lombok.Setter;

@Setter
public class ProductServiceImpl implements ProductService {

    @Inject
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

    public List<Product> getProductsByCategoryId(int categoryId) {
        return productRepository.getProductsByCategoryId(categoryId);
    }
}
