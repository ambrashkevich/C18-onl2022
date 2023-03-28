//2. Шахматная доска
//Создать программу для раскраски шахматной доски с помощью цикла.
//Создать двумерный массив String'ов 8х8. С помощью циклов задать
//элементам циклам значения B(Black) или W(White). Результат работы
//программы:
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                    System.out.println();
                }
            }
        }
    }
}



