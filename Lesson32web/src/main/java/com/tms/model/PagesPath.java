package com.tms.model;

public enum PagesPath {
    HOME_PAGE("home.jsp"),
    PRODUCT_PAGE("product.jsp"),
    SIGN_PAGE("signin.jsp"),
    CART_PAGE("cart.jsp"),
    CATEGORY_PAGE("category.jsp"),
    PROFILE_PAGE("profile.jsp");

    private final String path;

    public String getPath() {
        return path;
    }

    PagesPath(String path) {
        this.path = path;
    }
}
