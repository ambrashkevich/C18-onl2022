package by.tms.jdbc.utils;

import by.tms.jdbc.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {

    private static final String GET_ALL_STUDENTS_QUERY = "SELECT * FROM students_db.students";
    private static final String INSERT_STUDENT_QUERY = "INSERT INTO students(name, surname, course) VALUES(?, ?, ?);";
    private static final String UPDATE_STUDENT_QUERY = "UPDATE students SET course = ? WHERE id = ?;";
    private static final String DELETE_STUDENT_QUERY = "DELETE FROM students WHERE id = ?";

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(GET_ALL_STUDENTS_QUERY);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int age = rs.getInt("age");
                int course = rs.getInt("course");
                students.add(new Student(id, name, surname, age, course));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return students;
    }

    public static List<Student> saveStudent(Student student) {
        List<Student> updatedStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_QUERY);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getCourse());
            preparedStatement.executeUpdate();

            updatedStudents = getAllStudents();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedStudents;
    }

    public static List<Student> updateStudent(int studentId, int course) {
        List<Student> updatedStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT_QUERY);
            preparedStatement.setInt(1, course);
            preparedStatement.setInt(2, studentId);
            preparedStatement.executeUpdate();

            updatedStudents = getAllStudents();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedStudents;
    }

    public static List<Student> deleteStudent(int studentId) {
        List<Student> updatedStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_QUERY);
            preparedStatement.setInt(1, studentId);
            preparedStatement.execute();

            updatedStudents = getAllStudents();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedStudents;
    }


}
