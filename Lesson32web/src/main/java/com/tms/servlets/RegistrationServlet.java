//package com.tms.servlets;
//
//import static com.tms.util.CategoryHelper.categories;
//
//import com.tms.dao.UserDAO;
//import com.tms.model.Product;
//import com.tms.model.User;
//import java.io.IOException;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//@WebServlet("/")
//public class RegistrationServlet extends HttpServlet {
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        if (req.getAttribute("isValid").equals(false)) {
//            resp.sendRedirect("error.jsp");
//        }
//        List<Product> productsCart = new ArrayList<>();
//        req.getSession().setAttribute("productsCart", productsCart);
//        String name = req.getParameter("newUsrName");
//        String surname = req.getParameter("newUsrSurname");
//        String email = req.getParameter("newUsrEmail");
//        String password = req.getParameter("newUsrPass");
//        int year = Integer.parseInt(req.getParameter("brthYear"));
//        int dayOfMonth = Integer.parseInt(req.getParameter("brthDay"));
//        int month = Integer.parseInt(req.getParameter("brthMonth"));
//        LocalDate birthDate = LocalDate.of(year, month, dayOfMonth);
//        User user = new User(name, surname, password, email, birthDate);
//        req.getSession().setAttribute("user", user);
//        UserDAO.saveUser(new User(password, name, surname, email, birthDate));
//        String encodedURL = resp.encodeRedirectURL("home.jsp");
//        req.getSession().setAttribute("categories", categories);
//        resp.sendRedirect(encodedURL);
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendRedirect("error.jsp");
//    }
//}
