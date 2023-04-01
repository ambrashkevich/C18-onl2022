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
        int n = 0;
        int c = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число больше 3");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            } else {
                System.out.println("Ошибка. Вы ввели не число!");
            }
        }
        while (n < 4);
        int[] value = new int[n];
        for (int i = 0; i < value.length; i++) {
            value[i] = (int) (Math.random() * (n + 1));
            System.out.print(value[i] + " ");
            if (value[i] % 2 == 0 & value[i] != 0) {
                c++;
            }
        }
        System.out.println();
        if (c > 0) {
            int[] result = new int[c];
            for (int i = 0, b = 0; i < value.length; i++) {
                if (value[i] % 2 == 0 & value[i] != 0) {
                    result[b] = result[i];
                    System.out.print(result[b] + " ");
                }
            }
        }
    }
}


