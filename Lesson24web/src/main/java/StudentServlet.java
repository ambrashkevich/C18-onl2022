import by.tms.model.Student;
import by.tms.utils.CRUDUtils;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/students")

public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = CRUDUtils.getAllStudents();
        studentList.forEach(System.out::println);
        req.getSession().setAttribute("students", studentList);
        resp.sendRedirect("student.jsp");
    }
}
