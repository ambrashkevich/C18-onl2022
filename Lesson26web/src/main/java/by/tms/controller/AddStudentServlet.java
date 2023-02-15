package by.tms.controller;

import by.tms.model.Student;
import by.tms.utils.CRUDUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(value = "/add")
public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("addStudentForm.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> userParams = req.getParameterMap();
        Student student = new Student(userParams.get("fname")[0], userParams.get("lname")[0], Integer.parseInt(userParams.get("age")[0]));
        CRUDUtils.saveStudent(student);
        req.getRequestDispatcher("addStudentForm.jsp").forward(req, resp);
    }
}
