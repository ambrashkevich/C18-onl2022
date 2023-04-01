// 10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

import java.util.Arrays;


public class Task10 {

    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int currentMax = array[0];
        int maxPlace = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > currentMax) {
                currentMax = array[i];
                maxPlace = i;
            }
        }
        array[maxPlace] = array[0];
        array[0] = currentMax;
        System.out.println(Arrays.toString(array));
        System.out.println();
    }
}


