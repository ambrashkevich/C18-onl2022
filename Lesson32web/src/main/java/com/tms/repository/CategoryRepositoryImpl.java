package com.tms.repository;

import com.tms.model.Category;
import com.tms.util.CategoryHelper;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {

    @Override
    public List<Category> getCategories() {
        return CategoryHelper.categories;
    }

    @Override
    public Category getCategory(int id) {
        return CategoryHelper.categories.stream()
                                        .filter(product -> product.getId() == id)
                                        .findFirst()
                                        .orElse(null);
    }
}
