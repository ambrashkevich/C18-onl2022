package by.tms.utils;

import by.tms.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {

    private static final String GET_ALL_STUDENTS_QUERY = "SELECT * FROM Students";
    private static final String INSERT_STUDENT_QUERY = "INSERT INTO Students(firstname, lastname,age) VALUES(?, ?, ?);";
    private static final String UPDATE_STUDENT_QUERY = "UPDATE Students SET course = ? WHERE id = ?;";
    private static final String DELETE_STUDENT_QUERY = "DELETE FROM Students WHERE id = ?";
    private static final String SELECT_ALL_STUDENT_WITH_CITY = "SELECT * FROM STUDENTS LEFT JOIN CITY ON STUDENTS.ID = CITY.ID";

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(GET_ALL_STUDENTS_QUERY);
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                int age = rs.getInt("age");
                students.add(new Student(id, firstName, lastName, age));
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
            preparedStatement.setString(1, student.getFirstName());
            preparedStatement.setString(2, student.getLastName());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.executeUpdate();
            updatedStudents = getAllStudents();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedStudents;
    }

    public static List<Student> addStudent(int studentId) {
        List<Student> updatedStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT_QUERY);
            preparedStatement.setInt(1, studentId);
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

    public static List<Student> getAllStudentsWitchCity() {
        List<Student> studentsCity = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_STUDENT_WITH_CITY);
            while (resultSet.next()) {
                System.out.print(resultSet.getInt(1) + " ");
                System.out.print(resultSet.getString(2) + " ");
                System.out.print(resultSet.getString(3) + " ");
                System.out.print(resultSet.getInt(4) + " ");
                System.out.print(resultSet.getString(5) + " ");
                System.out.print(resultSet.getString(6) + " ");
                System.out.print(resultSet.getString(7) + " ");
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return studentsCity;
    }
}
