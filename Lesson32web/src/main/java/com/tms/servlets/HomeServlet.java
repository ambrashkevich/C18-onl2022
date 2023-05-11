//package com.tms.servlets;
//
//import static com.tms.util.HttpRequestParamValidator.validateParam;
//
//import static com.tms.util.Utils.ADMIN_LOGIN;
//import static com.tms.util.Utils.ADMIN_PASSWORD;
//import static com.tms.util.Utils.isUserLogIn;
//
//import com.tms.exception.ValidationException;
//import com.tms.model.Cart;
//import com.tms.model.Category;
//import com.tms.model.User;
//import com.tms.service.CategoryService;
//import java.io.IOException;
//import java.util.List;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/home")
//public class HomeServlet extends HttpServlet {
//
//    private CategoryService categoryService;
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//        categoryService = (CategoryService) config.getServletContext().getAttribute("categoryService");
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        User user = (User) req.getSession().getAttribute("username");
//        checkReceivedUser(user, req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String login = req.getParameter("username");
//        String pass = req.getParameter("password");
//        try {
//            validateParam(login);
//            validateParam(pass);
//            User user = new User(ADMIN_LOGIN, ADMIN_PASSWORD);
//            Cart cart = new Cart();
//            req.getSession().setAttribute("username", user);
//            req.getSession().setAttribute("cart", cart);
//            checkReceivedUser(user, req, resp);
//        } catch (ValidationException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    private void checkReceivedUser(User user, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        if (isUserLogIn(user)) {
//            List<Category> categories = categoryService.getCategories();
//            request.setAttribute("categories", categories);
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
//            requestDispatcher.forward(request, response);
//        } else {
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("signin.jsp");
//            requestDispatcher.forward(request, response);
//        }
//    }
//}