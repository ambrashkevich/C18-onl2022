package eshop.servletsexample;

import eshop.models.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet("/category")
public class CategoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String category = req.getParameter("name");
        Product product = getProducts(category);
        System.out.println(product.toString());
        req.getSession().setAttribute("phone", product);
        resp.sendRedirect("mobile.jsp");
//        req.getRequestDispatcher("/mobile.jsp").forward(req, resp);
    }

    public Product getProducts(String category) {
        if (category.equalsIgnoreCase("Mobile phones")) {
            return new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png");
        }
        return null;
    }
}
