//1. Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый
//элемент на заданное число. Пусть число, на которое будет
//увеличиваться каждый элемент, задается из консоли.

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        int[][][] arr = {{{1, 2}, {3, 4}, {5, 6}}, {{7, 8}, {9, 1}, {2, 3}}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] += num;
                }
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}


