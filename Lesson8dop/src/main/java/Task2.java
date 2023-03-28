//1. Создайте массив целых чисел. Удалите все вхождения заданного
//числа из массива.
//Пусть число задается с консоли (класс Scanner). Если такого числа нет -
//выведите сообщения об этом.
//В результате должен быть новый массив без указанного числа.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArray = getFillArray();
        int[] noEntryArray = findAndDeleteEntryInArray(numArray, num);
        System.out.println(Arrays.toString(noEntryArray));
    }

    static int[] getFillArray() {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        return array;
    }

    static int[] findAndDeleteEntryInArray(int[] array, int entry) {
        List<Integer> noEntryList = new ArrayList<>();
        boolean isPresent = false;
        for (int j : array) {
            if (j == entry) {
                System.out.println("Число входит в массив " + entry);
                isPresent = true;
            } else {
                noEntryList.add(j);
            }
        }
        if (!isPresent) {
            System.out.println("Число не входит в массив" + entry);
        }
        return noEntryList.stream().mapToInt(i -> i).toArray();
    }
}

