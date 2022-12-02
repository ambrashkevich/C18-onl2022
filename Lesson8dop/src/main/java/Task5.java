//4. Создайте массив из n случайных целых чисел и выведите его на экран.
//Размер массива пусть задается с консоли и размер массива может быть
//больше 5 и меньше или равно 10.
//Если n не удовлетворяет условию - выведите сообщение об этом.
//Если пользователь ввёл не подходящее число, то программа должна
//просить пользователя повторить ввод.
//Создайте второй массив только из чётных элементов первого массива,
//если они там есть, и вывести его на экран.

import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {
        int n = 0, c = 0;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите число больше 3");
            if (scn.hasNextInt()) {
                n = scn.nextInt();
            } else System.out.println("Ошибка. Вы ввели не число!");
        }
        while (n < 4);
        int[] Mas1 = new int[n];
        for (int i = 0; i < Mas1.length; i++) {
            Mas1[i] = (int) (Math.random() * (n + 1));
            System.out.print(Mas1[i] + " ");
            if (Mas1[i] % 2 == 0 & Mas1[i] != 0) c++;
        }
        System.out.println();
        if (c > 0) {
            int[] Mas2 = new int[c];
            for (int i = 0, b = 0; i < Mas1.length; i++) {
                if (Mas1[i] % 2 == 0 & Mas1[i] != 0) {
                    Mas2[b] = Mas1[i];
                    System.out.print(Mas2[b] + " ");
                }
            }
        }
    }
}


