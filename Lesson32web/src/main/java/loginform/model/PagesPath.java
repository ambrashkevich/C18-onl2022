package loginform.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PagesPath {
    PROFILE_PAGE("profile.jsp"),
    HOME_PAGE("home.jsp"),
    CART_PAGE("cart.jsp"),
    SIGN_IN_PAGE("sign.jsp"),
    PRODUCT_PAGE("product.jsp"),
    CATEGORY_PAGE("category.jsp");

    private final String path;
}
