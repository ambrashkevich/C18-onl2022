package by.tms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        Object email = session.getAttribute("email");
        Object pass = session.getAttribute("pass");
        System.out.println("from session " + email + " " + pass);
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("from session " + email + " " + pass);
    }
}