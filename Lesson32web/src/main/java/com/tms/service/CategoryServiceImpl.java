package com.tms.service;

import com.tms.model.Category;
import com.tms.model.Inject;
import com.tms.repository.CategoryRepository;
import java.util.List;
import lombok.Setter;

@Setter
public class CategoryServiceImpl implements CategoryService {

    @Inject
    private CategoryRepository categoryRepository;

    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }

    public Category getCategoryById(int id) {
        return categoryRepository.getCategory(id);
    }
}
