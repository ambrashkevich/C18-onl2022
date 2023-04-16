package loginform.servlets;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import loginform.dao.UserDAO;
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
        String name = req.getParameter("newUsrName");
        String surname = req.getParameter("newUsrSurname");
        String email = req.getParameter("newUsrEmail");
        Integer year = Integer.valueOf(req.getParameter("brthYear"));
        Integer dayOfMonth = Integer.valueOf(req.getParameter("brthDay"));
        Integer month = Integer.valueOf(req.getParameter("brthMonth"));
        LocalDate brthDate = LocalDate.of(year, month, dayOfMonth);
        String password = req.getParameter("newUsrPass");
        UserDAO.saveUser(new User(password, name, surname, email, brthDate));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("error.jsp");
    }
}
