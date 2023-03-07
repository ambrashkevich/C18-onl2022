package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet("/data")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String dayParam = request.getParameter("day");
        String monthParam = request.getParameter("month");
        String yearParam = request.getParameter("year");

        int day = Integer.parseInt(dayParam);
        int month = Integer.parseInt(monthParam);
        int year = Integer.parseInt(yearParam);

        LocalDate localDate = LocalDate.of(year, month, day);
        int dayOfYear = localDate.getDayOfYear();

        writer.println("<h1>Day of year: " + dayOfYear + "</h1>");
    }
}