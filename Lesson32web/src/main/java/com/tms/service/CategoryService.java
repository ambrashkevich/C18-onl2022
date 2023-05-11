package com.tms.service;

import com.tms.model.Category;
import java.util.List;


public interface CategoryService {

    List<Category> getCategories();

    Category getCategoryById(int id);
}

