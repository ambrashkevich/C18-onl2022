package com.tms.controller;

import static com.tms.model.PagesPath.PROFILE_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;

import com.tms.model.PagesPath;
import com.tms.model.User;
import com.tms.util.Constants;
import com.tms.util.Utils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;

@Controller(Constants.PROFILE_COMMAND)
public class ProfileController implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        User user = (User) request.getSession().getAttribute("username");
        if (Utils.isUserLogIn(user)) {
            return PROFILE_PAGE;
        } else {
            return SIGN_IN_PAGE;
        }
    }
}
