package com.tms.controller;

import static com.tms.model.PagesPath.HOME_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;
import static com.tms.util.HttpRequestParamValidator.validateParam;
import static com.tms.util.Utils.ADMIN_LOGIN;
import static com.tms.util.Utils.ADMIN_PASSWORD;
import static com.tms.util.Utils.isUserLogIn;

import com.tms.exception.ValidationException;
import com.tms.model.Cart;
import com.tms.model.Category;
import com.tms.model.Inject;
import com.tms.model.PagesPath;
import com.tms.model.User;
import com.tms.service.CategoryService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Slf4j
public class HomeController implements BaseCommandController {

    @Inject
    private CategoryService categoryService; //= new CategoryServiceImpl(new CategoryRepositoryImpl());

    @Override
    public PagesPath execute(HttpServletRequest request) {
        if (request.getMethod().equalsIgnoreCase("GET")) {
            var user = (User) request.getSession().getAttribute("username");
            return checkReceivedUser(user, request);
        } else {
            String login = request.getParameter("username");
            String pass = request.getParameter("password");
            try {
                validateParam(login);
                validateParam(pass);
                User user = new User(ADMIN_LOGIN, ADMIN_PASSWORD);
                Cart cart = new Cart();
                request.getSession().setAttribute("cart", cart);
                request.getSession().setAttribute("username", user);
                return checkReceivedUser(user, request);
            } catch (ValidationException e) {
                log.error("invalid data", e);
                throw new RuntimeException("invalid data");
            }
        }
    }

    private PagesPath checkReceivedUser(User user, HttpServletRequest request) {
        if (isUserLogIn(user)) {
            request.getSession().setAttribute("username", user);
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            return HOME_PAGE;
        } else {
            return SIGN_IN_PAGE;
        }
    }
}