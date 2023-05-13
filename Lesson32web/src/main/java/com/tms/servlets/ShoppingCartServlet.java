//package com.tms.servlets;
//
//import static com.tms.util.Utils.isUserLogIn;
//
//import com.tms.model.Cart;
//import com.tms.model.Product;
//import com.tms.model.User;
//import java.io.IOException;
//import java.math.BigDecimal;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@WebServlet("/cart")
//public class ShoppingCartServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        User user = (User) request.getSession().getAttribute("username");
//        if (isUserLogIn(user)) {
//            RequestDispatcher rd = request.getRequestDispatcher("cart.jsp");
//            rd.forward(request, response);
//        } else {
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("signin.jsp");
//            requestDispatcher.forward(request, response);
//        }
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        HttpSession session = request.getSession(false);
//        Cart cart = (Cart) session.getAttribute("cart");
//        int id = Integer.parseInt(request.getParameter("id"));
//        String imageName = request.getParameter("imageName");
//        String name = request.getParameter("name");
//        String description = request.getParameter("description");
//        String priceParameter = request.getParameter("price");
//        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
//        BigDecimal price = new BigDecimal(priceParameter);
//        Product product = new Product(id, imageName, name, description, price, categoryId);
//        String action = request.getParameter("action");
//        switch (action) {
//            case "Buy" -> {
//                cart.addProduct(product);
//                session.setAttribute("myProducts", cart.getProducts());
//                response.sendRedirect("/product?productId=" + product.getId());
//            }
//            case "Delete" -> {
//                cart.deleteProduct(product);
//                session.setAttribute("myProducts", cart.getProducts());
//                response.sendRedirect("/cart");
//            }
//            default -> {
//                System.out.println("Такой кнопки нет");
//            }
//        }
//    }
//}