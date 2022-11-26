//Создайте и заполните массив случайным числами и выведете
//максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random().
//Пусть будет возможность создавать массив произвольного размера.
//Пусть размер массива вводится с консоли.
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxValue;
        int minValue;
        double average;
        double number = 0;
        System.out.println("Введите размер массива");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            number += array[i];
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        maxValue = array[array.length - 1];
        minValue = array[0];
        average = number / array.length;
        System.out.println("Максимальное число массива" + maxValue);
        System.out.println("Минимальное число массива" + minValue);
        System.out.println(average);
    }
}
