package com.tms.controller;

import static com.tms.model.PagesPath.PROFILE_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;
import static com.tms.util.Utils.isUserLogIn;

import com.tms.model.PagesPath;
import com.tms.model.User;
import javax.servlet.http.HttpServletRequest;

public class ProfileController implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        User user = (User) request.getSession().getAttribute("username");
        if (isUserLogIn(user)) {
            return PROFILE_PAGE;
        } else {
            return SIGN_IN_PAGE;
        }
    }
}

