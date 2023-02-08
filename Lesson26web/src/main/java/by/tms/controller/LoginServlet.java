package by.tms.controller;

import by.tms.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/login", name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    //1. Создать страницу логина с формой ввода имени пользователя и пароля.
    // 2. Создать сервлет для обработки формы логина и определения пользователя
    // (можно использовать предустановленные значения имени и пароля, в БД нет необходимости).
    //пункты 1 и 2 уже реализованы, можно взять за основу в моем репозитории!
    // 3. Создать защищенную страницу, попасть на которую можно только после логина.
    // 4. Все запросы к защищенной странице должны приводить к перенаправлению на страницу логина,
    // если пользователь еще не залогинен, а если залогинен – должны всегда быть успешными


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");

        HttpSession session = req.getSession();
        session.setAttribute("email", email);
        session.setAttribute("pass", pass);

        resp.sendRedirect("/home");
//        System.out.println(email + " "+ pass);
//        resp.setContentType("text/plain");
//        if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
//            resp.getWriter().write("Success logged!!");
//        } else {
//            resp.getWriter().println("Параметры не корректные!");
//        }

    }
}

