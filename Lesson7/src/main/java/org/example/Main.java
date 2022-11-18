package org.example;

public class Main {
    public static void main(String[] args) {


        User user = new User();


        System.out.println("Имя и фамиля:" + user.getFirstAndLastName());

        System.out.println("Общая информация о пользователе: " + user.toString());

        System.out.println("Возраст: " + user.getAge());

        user.incrementAge();

        System.out.println("Увеличение возраста: " + user.getAge());
    }
}


class User {
    private String name;
    private String lastName;
    private int age;
    private Gender gender;


    public User() {
        this("Вадим", "Амбрашкевич", 21, Gender.MALE);
    }

    public User(String name, String lastName, int age, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;

    }


    public enum Gender {
        MALE,
        FEMALE,
        UNDEFINED;


    }

    public String getFirstAndLastName() {                   //Метод Возврата имени и фамилии полностью
        return this.name + " " + this.lastName;
    }

    @Deprecated
    public void incrementAge() {                             //Увеличения возраста
        this.age++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {                             // Вывод общей информации о пользователе
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

