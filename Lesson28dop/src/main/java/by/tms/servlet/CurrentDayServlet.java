package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*4) Создать сервлет для вывода номера дня в году по введенной дате. POST*/
@WebServlet("/cday")
public class CurrentDayServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print(dayOfYear(req.getParameter("date")));
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

    private int days[] = {31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31};

    private int dayOfYear(String date) {
        // Extract the year, month and the
        // day from the date string
        int year = Integer.parseInt(date.substring(0, 4));

        int month = Integer.parseInt(date.substring(5, 7));

        int day = Integer.parseInt(date.substring(8));

        // If current year is a leap year and the date
        // given is after the 28th of February then
        // it must include the 29th February
        if (month > 2 && year % 4 == 0 &&
                (year % 100 != 0 || year % 400 == 0)) {
            ++day;
        }

        // Add the days in the previous months
        while (--month > 0) {
            day = day + days[month - 1];
        }
        return day;
    }
}

