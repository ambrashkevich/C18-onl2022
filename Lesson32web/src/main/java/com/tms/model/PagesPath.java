package com.tms.model;

public enum PagesPath {
    PROFILE_PAGE("profile.jsp"),
    HOME_PAGE("home.jsp"),
    CART_PAGE("cart.jsp"),
    SIGN_IN_PAGE("signin.jsp"),
    PRODUCT_PAGE("product.jsp"),
    CATEGORY_PAGE("category.jsp");

    private final String path;

    PagesPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

