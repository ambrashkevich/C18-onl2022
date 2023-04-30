package com.tms.repository;

import com.tms.model.Category;
import java.util.List;

public interface CategoryRepository {

    List<Category> getCategories();

    Category getCategory(int id);

}