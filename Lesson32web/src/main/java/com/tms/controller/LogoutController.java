package com.tms.controller;

import static com.tms.model.PagesPath.SIGN_IN_PAGE;

import com.tms.model.PagesPath;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutController implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return SIGN_IN_PAGE;
    }
}
