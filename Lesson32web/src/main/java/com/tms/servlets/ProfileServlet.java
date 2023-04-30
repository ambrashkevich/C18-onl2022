package com.tms.servlets;

import static com.tms.util.Utils.isUserLogIn;

import com.tms.model.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("username");
        if (isUserLogIn(user)) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/profile");
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/signin.jsp");
            requestDispatcher.forward(req, resp);
        }
    }
}
