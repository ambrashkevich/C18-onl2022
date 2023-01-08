package by.tms.task4;

public class Calculator {
    public static <T extends Number, K extends Number> int sum(T t, K k) {
        return t.intValue() + k.intValue();
    }

    public static <T extends Number, K extends Number> int multiply(T t, K k) {
        return t.intValue() * k.intValue();
    }

    public static <T extends Number, K extends Number> int divide(T t, K k) {
        return t.intValue() / k.intValue();
    }

    public static <T extends Number, K extends Number> int subtraction(T t, K k) {
        return t.intValue() - k.intValue();
    }
}
