package com.tms.controller;

import static com.tms.model.PagesPath.HOME_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;

import com.tms.exception.ValidationException;
import com.tms.model.Cart;
import com.tms.model.Category;
import com.tms.model.PagesPath;
import com.tms.model.User;
import com.tms.service.CategoryService;
import com.tms.util.Constants;
import com.tms.util.HttpRequestParamValidator;
import com.tms.util.Utils;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Setter
@Slf4j
@Controller(Constants.HOME_COMMAND)
@RequiredArgsConstructor
public class HomeController implements BaseCommandController {

    private final CategoryService categoryService;

    @Override
    public PagesPath execute(HttpServletRequest request) {
        if (request.getMethod().equalsIgnoreCase("GET")) {
            var user = (User) request.getSession().getAttribute("username");
            return checkReceivedUser(user, request);
        } else {
            String login = request.getParameter("username");
            String pass = request.getParameter("password");
            try {
                HttpRequestParamValidator.validateParam(login);
                HttpRequestParamValidator.validateParam(pass);
                User user = new User(Utils.ADMIN_LOGIN, Utils.ADMIN_PASSWORD);
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
        if (Utils.isUserLogIn(user)) {
            request.getSession().setAttribute("username", user);
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            return HOME_PAGE;
        } else {
            return SIGN_IN_PAGE;
        }
    }
}