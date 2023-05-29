package com.tms.controller;


import static com.tms.model.PagesPath.PRODUCT_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;

import com.tms.exception.CommandException;
import com.tms.model.PagesPath;
import com.tms.model.Product;
import com.tms.model.User;
import com.tms.service.ProductService;
import com.tms.util.Constants;
import com.tms.util.Utils;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

@Controller(Constants.PRODUCT_COMMAND)
@Setter
@RequiredArgsConstructor
public class ProductController implements BaseCommandController {


    private final ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        User user = (User) request.getSession().getAttribute("username");
        if (Utils.isUserLogIn(user)) {
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