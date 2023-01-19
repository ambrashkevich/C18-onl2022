package by.tms.jdbc.model;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int age;
    private int course;

    public Student(int id, String name, String surname, int age, int course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
    }

    public Student(String name, String surname, int age, int course) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
