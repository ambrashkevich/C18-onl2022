//0. Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        int[] numArray = new int[10];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i;
        }
        boolean checkNumber = checkNumber(num, numArray);
        System.out.println(checkNumber ? "Число входит:":"Число не входит");
        System.out.println(Arrays.toString(numArray));
    }

    private static boolean checkNumber(int number, int[] marks) {
        for (int mark : marks) {
            if (mark == number) {
                return true;
            }
        }
        return false;
    }
}




