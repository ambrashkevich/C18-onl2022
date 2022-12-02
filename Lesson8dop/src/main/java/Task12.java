//Создайте двумерный массив целых чисел. Отсортируйте элементы в
//строках двумерного массива по возрастанию
public class Task12 {

    public static void main(String[] args) {

        int[][] array = new int[3][3];
        int min = 0;
        int max = 10;
        int b;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = min + (int) (Math.random() * (max - min + 1));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("_____");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i][j] > array[i][k]) {
                        b = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = b;
                    }
                }
            }
        }
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }
}


