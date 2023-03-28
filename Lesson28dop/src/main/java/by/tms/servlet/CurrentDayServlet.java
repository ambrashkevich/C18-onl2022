package by.tms.servlet;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*4) Создать сервлет для вывода номера дня в году по введенной дате. POST*/
@WebServlet("/cday")
public class CurrentDayServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LocalDate date = getLocalDate(req);
        req.setAttribute("currentDayOfYear", date);
        req.setAttribute("dayOfYear", date);
        forward(req, resp, "/cday");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("<!doctype html>\n" +
                                       "<html lang=\"en\">\n" +
                                       "<head>\n" +
                                       "    <meta charset=\"UTF-8\">\n" +
                                       "    <meta name=\"viewport\"\n" +
                                       "          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n" +
                                       "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                                       "    <title>Document</title>\n" +
                                       "</head>\n" +
                                       "<body>\n" +
                                       "<form action=\"/cday\" method=\"post\"><input value=\"date\" type=\"text\">\n" +
                                       "    <button type=\"submit\">Отправить</button>\n" +
                                       "</form>\n" +
                                       "\n" +
                                       "</body>\n" +
                                       "</html>");
    }

    public static LocalDate getLocalDate(HttpServletRequest req) {
        return LocalDate.parse(req.getParameter("date"));
    }

    public static void forward(HttpServletRequest req, HttpServletResponse resp, String address) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher(address).forward(req, resp);
    }
}

