package com.tms.repository;

import com.tms.model.Category;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JdbcCategoryRepository implements CategoryRepository {

    private final Connection connection;

    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            String sql = "select * from categories";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                categories.add(
                        Category.builder()
                                .id(resultSet.getInt("id"))
                                .name(resultSet.getString("name"))
                                .imageName(resultSet.getString("imageName"))
                                .build());
            }
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return categories;
    }

    @Override
    public Category getCategory(int id) {
        List<Category> categories = getCategories();
        return categories.stream()
                         .filter(product -> product.getId() == id)
                         .findFirst()
                         .orElse(null);
    }
}
