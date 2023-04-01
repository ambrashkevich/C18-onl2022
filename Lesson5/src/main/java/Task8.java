//Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
////        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
////        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

import java.util.Arrays;
import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        int[] mass = new int[12];
        Random generate = new Random();
        for (int i = 0; i < 12; i++) {
            mass[i] = generate.nextInt(16);
        }
        System.out.println(Arrays.toString(mass));

        int currentMax = mass[0];
        int maxIndex = 0;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] >= currentMax) {
                currentMax = mass[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальный эелемент " + currentMax + ", индекс его последнего вхождения в массив = " + (maxIndex));
        System.out.println();
    }
}


