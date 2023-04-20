package loginform.servlets;

import static loginform.util.CategoryHelper.categories;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import loginform.dao.UserDAO;
import loginform.model.Product;
import loginform.model.User;

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
        req.getSession().setAttribute("categories", categories);
        resp.sendRedirect(encodedURL);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("error.jsp");
    }
}
