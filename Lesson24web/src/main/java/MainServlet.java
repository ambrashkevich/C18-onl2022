import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/result")

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("index.jsp");
        Integer a = Integer.valueOf(req.getParameter("a"));
        Integer b = Integer.valueOf(req.getParameter("b"));
        String operator = req.getParameter("operator");
        String result = "error";
        if ("+".equals(operator)) {
            result = String.valueOf(a + b);
            //http://localhost:8080/result?a=12&b=6&operator=%2B
        }
        if ("-".equals(operator)) {
            result = String.valueOf(a - b);
            //http://localhost:8080/result?a=12&b=6&operator=-
        }
        if ("*".equals(operator)) {
            result = String.valueOf(a * b);
            //http://localhost:8080/result?a=12&b=6&operator=*
        }
        if ("/".equals(operator)) {
            result = String.valueOf(a / b);
            //http://localhost:8080/result?a=12&b=6&operator=/
        }
        req.getSession().setAttribute("result", result);
    }
}
