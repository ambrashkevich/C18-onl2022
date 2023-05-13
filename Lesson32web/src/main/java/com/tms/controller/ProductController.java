package com.tms.controller;


import static com.tms.model.PagesPath.PRODUCT_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;
import static com.tms.util.Utils.isUserLogIn;

import com.tms.exception.CommandException;
import com.tms.model.Inject;
import com.tms.model.PagesPath;
import com.tms.model.Product;
import com.tms.model.User;
import com.tms.service.ProductService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.Setter;

@Setter
public class ProductController implements BaseCommandController {

    @Inject
    private ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        User user = (User) request.getSession().getAttribute("username");
        if (isUserLogIn(user)) {
            List<Product> products = productService.getProducts();
            request.getSession().setAttribute("products", products);
            int productId = Integer.parseInt(request.getParameter("productId"));
            Product product = productService.getProductById(productId);
            request.setAttribute("oneProduct", product);
            return PRODUCT_PAGE;
        } else {
            return SIGN_IN_PAGE;
        }
    }
}