package com.tms.controller;



import com.tms.exception.CommandException;
import com.tms.model.PagesPath;
import com.tms.model.User;
import com.tms.util.Constants;
import com.tms.util.Utils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;

@Controller(Constants.CART_COMMAND)
public class CartController implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        User user = (User) request.getSession().getAttribute("username");
        if (Utils.isUserLogIn(user)) {
            return PagesPath.CART_PAGE;
        } else {
            return PagesPath.SIGN_IN_PAGE;
        }
    }
}