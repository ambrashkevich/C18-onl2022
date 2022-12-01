//Дополнительное задание
//4. Создайте двумерный массив целых чисел. Выведите на консоль сумму
//всех элементов массива.

public class Task10 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] array = new int[2][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * 10) + 1);
                System.out.print(array[i][j] + "\t");

            }
            System.out.println();
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
            }

        }
        System.out.println("Сумма элементов массива:" + " " + sum);
    }
}
