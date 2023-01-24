package by.tms.jdbc;

import by.tms.jdbc.model.Student;
import by.tms.jdbc.utils.CRUDUtils;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Student student = new Student(1, "Ivanov", "Ivanovich", 3);
        System.out.println("Saved students:");
        System.out.println(CRUDUtils.saveStudent(student));
        System.out.println("---------------------------------------------------");
//        while (true) {
//            System.out.println("11");
//            CRUDUtils.getAllStudents();
//            Thread.sleep(100000);
//        }

        System.out.println("All students:");
        System.out.println(CRUDUtils.getAllStudents());
        System.out.println("---------------------------------------------------");

        System.out.println("Updated students:");
        System.out.println(CRUDUtils.addStudent(1, 3));
        System.out.println("----------------------------------------------------");

        System.out.println("Deleted students: ");
        System.out.println(CRUDUtils.deleteStudent(8));
    }
}
