//Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month;
        month = scanner.nextInt() - 1;
        System.out.println();
        printSymbol(day,
                month);
    }

    private static void printSymbol(int day, int month) {
        if ((day >= 23 && month == 11) || (day <= 20 && month == 0))
            System.out.println("Ваш знак зодиака Козерог");
        if ((day >= 21 && month == 0) || (day <= 19 && month == 1))
            System.out.println("Ваш знак зодиака Водолей");
        if ((day >= 20 && month == 1) || (day <= 20 && month == 2))
            System.out.println("Ваш знак зодиака Рыба");
        if ((day >= 21 && month == 2) || (day <= 20 && month == 3))
            System.out.println("Ваш знак зодиака Овен");
        if ((day >= 21 && month == 3) || (day <= 21 && month == 4))
            System.out.println("Ваш знак зодиака Телец");
        if ((day >= 22 && month == 4) || (day <= 21 && month == 5))
            System.out.println("Ваш знак зодиака Близнецы");
        if ((day >= 22 && month == 5) || (day <= 22 && month == 6))
            System.out.println("Ваш знак зодиака Рак");
        if ((day >= 23 && month == 6) || (day <= 21 && month == 7))
            System.out.println("Ваш знак зодиака Лев");
        if ((day >= 22 && month == 7) || (day <= 23 && month == 8))
            System.out.println("Ваш знак зодиака Дева");
        if ((day >= 24 && month == 8) || (day <= 23 && month == 9))
            System.out.println("Ваш знак зодиака Весы");
        if ((day >= 24 && month == 9) || (day <= 23 && month == 10))
            System.out.println("Ваш знак зодиака Скорпион");
        if ((day >= 23 && month == 10) || (day <= 22 && month == 11))
            System.out.println("Ваш знак зодиака Стрелец");
    }
}

