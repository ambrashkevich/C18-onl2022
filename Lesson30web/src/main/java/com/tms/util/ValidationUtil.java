package com.tms.util;

import java.time.LocalDate;
import java.time.Period;

public class ValidationUtil {

    public static boolean isValidName(String name, String surname) {
//        System.out.println("name: " + name.matches("[a-zA-z]{3,20}") + surname.matches("[a-zA-z]{3,20}"));
        return name.matches("[a-zA-z]{3,20}") && surname.matches("[a-zA-z]{3,20}");
    }

    public static boolean isValidEmail(String email) {
//        System.out.println("email: " + email.matches("[a-zA-z0-9]{1,20}[@][a-zA-Z]{3,10}[\\.][a-zA-Z]{2,6}"));
        return email.matches("[a-zA-z0-9]{1,20}[@][a-zA-Z]{3,10}[\\.][a-zA-Z]{2,6}");
    }

    public static boolean isValidAge(LocalDate birthday) {
//        System.out.println("age: " + (Period.between(birthday, LocalDate.now()).getYears() > 16));
        return Period.between(birthday, LocalDate.now()).getYears() > 16;
    }

    public static boolean isValidPassword(String password) {
//        System.out.println("pass: " + password.matches("[a-zA-z0-9]{8,20}"));
        return password.matches("[a-zA-z0-9]{8,20}");
    }
}
