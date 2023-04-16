package eshop.servlets;

import eshop.model.Product;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("productsCart") != null) {
            List<Product> productListCart = (List<Product>) req.getSession().getAttribute("productsCart");
            int productId = Integer.parseInt(req.getParameter("product"));
            List<Product> productsList = (List<Product>) req.getSession().getAttribute("products");
            for (int i = 0; i < productListCart.size(); i++) {
                if (productListCart.get(i).getId() == productId) {
                    productListCart.remove(i);
                }
            }
            req.getSession().setAttribute("productsCart", productListCart);
        }
        resp.sendRedirect("cart.jsp");
    }
}
