package com.tms.models;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {

    private int id;
    private String name;
    private String imageName;
    private List<Product> productList;

    public Category(int id, String imageName) {
        this.id = id;
        this.imageName = imageName;
    }

    public Category(int id, String name, String imageName) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
    }
}