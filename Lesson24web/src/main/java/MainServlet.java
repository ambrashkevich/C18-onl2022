import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value = "/result")

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int a = 1;
//        int b = 2;
//        int c = a + b;
//        String result = a + " + " + b + " = " + c;
//        req.setAttribute("result", result);
//        req.getSession().setAttribute("result", result);
//        resp.sendRedirect("index.jsp?message=" + URLEncoder.encode(result, "UTF-8"));
        resp.sendRedirect("index.jsp");
        Integer a = Integer.valueOf(req.getParameter("a"));
        Integer b = Integer.valueOf(req.getParameter("b"));
        String operator = req.getParameter("operator");
        String result = "error";
        if (operator.equals("+")) {
            result = String.valueOf(a + b);
            //http://localhost:8080/result?a=12&b=6&operator=%2B
        }
        if (operator.equals("-")) {
            result = String.valueOf(a - b);
            //http://localhost:8080/result?a=12&b=6&operator=-
        }
        if (operator.equals("*")) {
            result = String.valueOf(a * b);
            //http://localhost:8080/result?a=12&b=6&operator=*
        }
        if (operator.equals("/")) {
            result = String.valueOf(a / b);
            //http://localhost:8080/result?a=12&b=6&operator=/
        }
        req.getSession().setAttribute("result", result);
    }
}
