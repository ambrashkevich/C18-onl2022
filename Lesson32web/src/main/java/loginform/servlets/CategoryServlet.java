package loginform.servlets;


import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import loginform.model.Product;
import loginform.util.ProductHelper;

@WebServlet("/category")
public class CategoryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("productsCart") == null) {
            List<Product> productsCart = ProductHelper.products;
            req.getSession().setAttribute("productsCart", productsCart);
        }
        int productId = Integer.valueOf(req.getParameter("product"));
        List<Product> productList = ProductHelper.products;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == productId) {
                List<Product> productListCart = (List<Product>) req.getSession().getAttribute("productsCart");
                productListCart.add(productList.get(i));
                req.getSession().setAttribute("productsCart", productListCart);
            }
        }
        resp.sendRedirect("product.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = ProductHelper.products;
        req.getSession().setAttribute("products", products);
        resp.sendRedirect("products.jsp");
    }
}