//заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали

import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        calculateSumOfDiagonalElements();
    }

    public static void calculateSumOfDiagonalElements() {
        int[][] mass = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = random.nextInt(100);
            }
            System.out.println(Arrays.toString(mass[i]));
        }
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            result += mass[i][i];
        }
        System.out.println(result);
    }
}

