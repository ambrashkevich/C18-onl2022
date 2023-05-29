package com.tms.controller;


import com.tms.model.Cart;
import com.tms.model.PagesPath;
import com.tms.model.Product;
import com.tms.util.Constants;
import java.math.BigDecimal;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;

@Controller(Constants.SHOPPING_CART_POST_COMMAND)
public class CartPostController implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Cart cart = (Cart) session.getAttribute("cart");
        int id = Integer.parseInt(request.getParameter("id"));
        String imageName = request.getParameter("imageName");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String priceParameter = request.getParameter("price");
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        BigDecimal price = new BigDecimal(priceParameter);
        Product product = new Product(id, imageName, name, description, price, categoryId);
        String action = request.getParameter("action");
        PagesPath path = null;
        switch (action) {
            case "Buy" -> {
                cart.addProduct(product);
                session.setAttribute("myProducts", cart.getProducts());
                request.setAttribute("oneProduct", product);
                path = PagesPath.PRODUCT_PAGE;
            }
            case "Delete" -> {
                cart.deleteProduct(product);
                session.setAttribute("myProducts", cart.getProducts());
                path = PagesPath.CART_PAGE;
            }
            default -> System.out.println("Такой кнопки нет");
        }
        return path;
    }
}