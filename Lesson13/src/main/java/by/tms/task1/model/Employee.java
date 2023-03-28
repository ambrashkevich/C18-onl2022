package by.tms.task1.model;

public class Employee implements Report {

    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String generateReport() {
        return String.format("|%-30s|%13.3f|", fullName, salary); //Выравниваем по левому краю на 30 символов, и формат десятичного числа
    }
}
