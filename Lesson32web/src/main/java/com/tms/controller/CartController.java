package com.tms.controller;

import static com.tms.model.PagesPath.CART_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;
import static com.tms.util.Utils.isUserLogIn;

import com.tms.exception.CommandException;
import com.tms.model.PagesPath;
import com.tms.model.User;
import javax.servlet.http.HttpServletRequest;

public class CartController implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        User user = (User) request.getSession().getAttribute("username");
        if (isUserLogIn(user)) {
            return CART_PAGE;
        } else {
            return SIGN_IN_PAGE;
        }
    }
}