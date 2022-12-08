// 7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
////        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
public class Task7 {
    public static void main(String[] args) {
        int value = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) value++;
        }
        int[] mas = new int[value];
        for (int i = 1, b = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                mas[b] = i;
                System.out.print(mas[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
    }
}


