package com.tms.servlets;

import static com.tms.util.Utils.isUserLogIn;

import com.tms.model.Product;
import com.tms.model.User;
import com.tms.service.ProductService;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/category")
public class CategoryServlet extends HttpServlet {

    private ProductService productService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        productService = (ProductService) config.getServletContext().getAttribute("productService");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("username");
        if (isUserLogIn(user)) {
            int categoryId = Integer.parseInt(req.getParameter("categoryId"));
            String nameCategory = req.getParameter("nameCategory");
            List<Product> categoryProducts = productService.getProductsByCategoryId(categoryId);
            req.setAttribute("products", categoryProducts);
            req.setAttribute("nameCategory", nameCategory);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("category.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("signin.jsp");
            requestDispatcher.forward(req, resp);
        }
    }
}