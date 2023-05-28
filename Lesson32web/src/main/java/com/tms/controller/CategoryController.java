package com.tms.controller;

import static com.tms.model.PagesPath.CATEGORY_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;

import com.tms.model.Category;
import com.tms.model.PagesPath;
import com.tms.model.Product;
import com.tms.model.User;
import com.tms.service.CategoryService;
import com.tms.service.ProductService;
import com.tms.util.Constants;
import com.tms.util.Utils;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller(Constants.CATEGORY_COMMAND)
@RequiredArgsConstructor
public class CategoryController implements BaseCommandController {

    private final CategoryService categoryService;
    private final ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("username");
        if (Utils.isUserLogIn(user)) {
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            int categoryId = Integer.parseInt(request.getParameter("categoryId"));
            //  String nameCategory = request.getParameter("nameCategory");
            List<Product> categoryProducts = productService.getProductsByCategoryId(categoryId);
            request.setAttribute("products", categoryProducts);
            // request.setAttribute("nameCategory", nameCategory);
            return CATEGORY_PAGE;
        } else {
            return SIGN_IN_PAGE;
        }
    }
}