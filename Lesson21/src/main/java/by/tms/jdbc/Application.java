package by.tms.jdbc;

import by.tms.jdbc.model.City;
import by.tms.jdbc.model.Student;
import by.tms.jdbc.utils.CRUDUtils;
import by.tms.jdbc.utils.CityUtils;


public class Application {
    public static void main(String[] args) {
        Student student = new Student(7, "Ivanov", "Ivanovich", 3);
        System.out.println("Saved students:");
        System.out.println(CRUDUtils.saveStudent(student));
        System.out.println("---------------------------------------------------");

        System.out.println("All students:");
        System.out.println(CRUDUtils.getAllStudents());
        System.out.println("---------------------------------------------------");

        System.out.println("Updated students:");
        System.out.println(CRUDUtils.addStudent(6));
        System.out.println("----------------------------------------------------");

        System.out.println("Deleted students: ");
        System.out.println(CRUDUtils.deleteStudent(6));
        System.out.println("----------------------------------------------------");

        System.out.println("Get all cities with students");
        System.out.println(CRUDUtils.getAllStudentsWitchCity());
        System.out.println("----------------------------------------------------");
        System.out.println();

        System.out.println("Add cities: ");
        System.out.println(CityUtils.addCity(new City(6, "Warsawa", "Capital Poland")));
        System.out.println("----------------------------------------------------");

        System.out.println("Delete cities: ");
        System.out.println(CityUtils.deleteCity(6));
        System.out.println("----------------------------------------------------");
        System.out.println();
    }
}
