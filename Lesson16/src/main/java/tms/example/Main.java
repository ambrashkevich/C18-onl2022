package tms.example;

import by.tms.task2.model.Animal;
import by.tms.task2.model.Generics;
import by.tms.task3.MinMax;
import by.tms.task4.Calculator;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        /**
         * 1) Список каталога
         * Написать метод который циклически просматривает содержимое заданного каталога и выводит на печать информацию о всех файлах и каталогах, находящихся в нем и в его подкаталогах.
         * Используем рекурсию.
         */
        File directory = new File("Lesson16/src/main/java/by/tms/task1");
        readFiles(directory);
        /**
         * 2) Обобщенный класс с тремя параметрами
         * Создать обобщенный класс с тремя параметрами (T, V, K).
         * Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
         * методы возвращающие значения трех переменных. Создать метод, выводящий на консоль имена классов для трех переменных класса.
         * Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (String),
         * V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.
         */
        Generics<String, Animal, Double> generics = new Generics<>("name", new Animal("Ив"), 1.3);
        System.out.println(generics.getT());
        System.out.println(generics.getV());
        System.out.println(generics.getK());
        System.out.println(generics.className());
        /**
         * 3) Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
         * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
         * Написать метод принимающий MinMax объект и печатающий информацию об элементах.
         */{
            Integer[] arrayOfInteger = {56, 45, 89, 91, 9};
            Double[] arrayOfDouble = {5.6, 7.8, 3.5, 9.1};

            MinMax<?> minMaxInteger = new MinMax<>(arrayOfInteger);
            getInfo(minMaxInteger);
            printMinAndMaxValue(minMaxInteger);

            MinMax<?> minMaxDouble = new MinMax<>(arrayOfDouble);
            getInfo(minMaxDouble);
            printMinAndMaxValue(minMaxDouble);
        }

        /**
         * 4) Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - sum, multiply, divide,
         * subtraction. Параметры этих методов - два числа разного типа, над которыми должна быть произведена операция.
         */
        System.out.println(Calculator.sum(5, 5));
        System.out.println(Calculator.multiply(5, 5));
        System.out.println(Calculator.divide(5, 5));
        System.out.println(Calculator.subtraction(5, 5));
    }

    public static void getInfo(MinMax<?> minMax) {
        for (int i = 0; i < minMax.getArrayOfNumbers().length; i++) {
            System.out.println(minMax.getArrayOfNumbers()[i]);
        }
    }


    private static void printMinAndMaxValue(MinMax<?> minMax) {
        System.out.println("Min element: " + minMax.getMin() + "\n" + "Max element: " + minMax.getMax());
    }

    public static void readFiles(File baseDirectory) {
        if (baseDirectory.isDirectory()) {
            for (File file : baseDirectory.listFiles()) {
                if (file.isFile()) {
                    System.out.println(file.getName() + " файл");
                } else {
                    System.out.println(file.getName() + " каталог");
                }
            }
        }
    }
}


