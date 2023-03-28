package by.tms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*3) Создать сервлет для вывода дня недели по введенной дате. Методом GET.*/
@WebServlet("/cdate")
public class CurrentDateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LocalDate date = LocalDate.of(Integer.parseInt(req.getParameter("year")), Integer.parseInt(req.getParameter("month")), Integer.parseInt(req.getParameter("day")));
        PrintWriter pw = resp.getWriter();
        pw.print(date.getDayOfWeek());
        /*http://localhost:8080/cdate?year=2023&month=03&day=02*/
    }
}
