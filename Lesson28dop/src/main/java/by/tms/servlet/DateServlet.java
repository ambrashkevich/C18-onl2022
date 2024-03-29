/**
 * 2) Создать сервлет для вывода текущей даты и времени. Постоянное обновление страницы или коммонента, что бы время в браузере обновлялось.
 */

package by.tms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*2) Создать сервлет для вывода текущей даты и времени. Постоянное обновление страницы или коммонента, что бы время в браузере обновлялось.*/
@WebServlet("/date")
public class DateServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setIntHeader("Refresh", 1);
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String title = "Текущая дата и время";
        Date date = new Date();
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
        out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
                            + "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + title + "</h1>\n" + "<h2 align=\"center\">"
                            + date.toString() + "</h2>\n" + "</body></html>");
    }
}