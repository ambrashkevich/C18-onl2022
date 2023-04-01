package by.tms.servlet;

import java.io.File;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//*1) Клиент при обращении к серверу получает случайно выбранное стихотворение
// Максима Богдановича из файла.

@WebServlet("/poem")
public class PoemServlet extends HttpServlet {

    public void init() throws ServletException {
        super.init();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try {
            File file = new File("src/main/resources/poem");
            if (file.canRead()) {
                new String(getServletContext().getResourceAsStream("src/main/resources/poem" + ".txt").readAllBytes());
            }
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "error");
        }
    }

    public void destroy() {
        super.destroy();
    }
}