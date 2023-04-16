package eshop.servlets;

import eshop.dao.UserDAO;
import eshop.model.Category;
import eshop.model.Product;
import eshop.model.User;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet(“/register”)
public class RegistrationServlet (){}
реализовать логику регистрации пользователя.
Можно сохранять нового пользователя в static коллекцию, либо использовать БД.
Обязательно сделать валидацию данных, которые приходят с формы регистрации в сервлете.*/
@WebServlet("/sign-up")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getAttribute("isValid").equals(false)) {
            resp.sendRedirect("error.jsp");
        }
        List<Product> productsCart = new ArrayList<>();
        req.getSession().setAttribute("productsCart", productsCart);
        String name = req.getParameter("newUsrName");
        String surname = req.getParameter("newUsrSurname");
        String email = req.getParameter("newUsrEmail");
        int year = Integer.parseInt(req.getParameter("brthYear"));
        int dayOfMonth = Integer.parseInt(req.getParameter("brthDay"));
        int month = Integer.parseInt(req.getParameter("brthMonth"));
        LocalDate brthDate = LocalDate.of(year, month, dayOfMonth);
        req.getSession().setAttribute("name", name);
        req.getSession().setAttribute("surname", surname);
        req.getSession().setAttribute("email", email);
        req.getSession().setAttribute("brthday", brthDate);
        String password = req.getParameter("newUsrPass");
        UserDAO.saveUser(new User(password, name, surname, email, brthDate));
        String encodedURL = resp.encodeRedirectURL("home.jsp");
        List<Category> categories = getCategories();
        req.getSession().setAttribute("categories", categories);
        resp.sendRedirect(encodedURL);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("error.jsp");
    }
    private List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        Category mobilePhones = new Category(1, "Mobile phones", "mobile.jpg");
        Category laptops = new Category(2, "Laptops", "laptop.jpg");
        Category jpsNavigators = new Category(3, "GPS Navigators", "jps_nav.jpg");
        Category fridges = new Category(4, "Fridges", "fridge.jpg");
        Category car = new Category(5, "Cars", "car.jpg");
        Category camera = new Category(6, "Camera", "camera.jpg");
        categories.add(mobilePhones);
        categories.add(laptops);
        categories.add(jpsNavigators);
        categories.add(fridges);
        categories.add(car);
        categories.add(camera);
        return categories;
    }
}
