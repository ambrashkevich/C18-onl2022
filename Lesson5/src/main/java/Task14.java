//12) Создаём квадратную матрицу, размер вводим с клавиатуры.
////        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
////        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
////        Пример:
////          1 2 3 4      1 6 3 1
////          6 7 8 9      2 7 3 5
////          3 3 4 5      3 8 4 6
////          1 5 6 7      4 9 5 7

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        System.out.println("Введите размер матрицы (целое положительное число)");
        Scanner input;
        int dim;
        while (true) {
            input = new Scanner(System.in);
            if (input.hasNextInt()) {
                dim = input.nextInt();
                if (dim > 0) {
                    break;
                }
            }
            System.out.println("Введите целое положительное число");
        }
        int[][] matrix = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                Random generate = new Random();
                matrix[i][j] = generate.nextInt(51);
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        transpose(matrix);
    }

    public static void transpose(int[][] matr) {
        int[][] transposedMatr = new int[matr.length][matr.length];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                transposedMatr[j][i] = matr[i][j];
            }
        }
        for (int[] ints : transposedMatr) {
            for (int j = 0; j < transposedMatr.length; j++) {
                System.out.printf("%2d ", ints[j]);
            }
            System.out.println();
        }
    }
}



