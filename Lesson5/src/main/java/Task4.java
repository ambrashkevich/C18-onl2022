//Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int month, day;
        Scanner c = new Scanner(System.in);
        System.out.println("Введитие день:");
        day = c.nextInt();
        System.out.println("Введите месяц: ");
        month = c.nextInt();
        if (month > 11) {
            System.out.println("Неккоректные данные");
        }
        if (day > 31) {
            System.out.println("Неккоректные данные");
        } else if ((day >= 21 && month == 0) || (day <= 19 && month == 1))
            System.out.println("Ваш знак зодиака Водолей");
        else if ((day >= 20 && month == 1 && day <=28) || (day <= 20 && month == 2))
            System.out.println("Ваш знак зодиака Рыба");
        else if ((day >= 21 && month == 2) || (day <= 20 && month == 3))
            System.out.println("Ваш знак зодиака Овен");
        else if ((day >= 21 && month == 3) || (day <= 21 && month == 4))
            System.out.println("Ваш знак зодиака Телец");
        else if ((day >= 22 && month == 4) || (day <= 21 && month == 5))
            System.out.println("Ваш знак зодиака Близнецы");
        else if ((day >= 22 && month == 5) || (day <= 22 && month == 6))
            System.out.println("Ваш знак зодиака Рак");
        else if ((day >= 23 && month == 6) || (day <= 21 && month == 7))
            System.out.println("Ваш знак зодиака Лев");
        else if ((day >= 22 && month == 7) || (day <= 23 && month == 8))
            System.out.println("Ваш знак зодиака Дева");
        else if ((day >= 24 && month == 8) || (day <= 23 && month == 9))
            System.out.println("Ваш знак зодиака Весы");
        else if ((day >= 24 && month == 9) || (day <= 23 && month == 10))
            System.out.println("Ваш знак зодиака Скорпион");
        else if ((day >= 23 && month == 10) || (day <= 22 && month == 11))
            System.out.println("Ваш знак зодиака Стрелец");
        else if ((day >= 23 && month == 11) || (day <= 20 && month == 0))
            System.out.println("Ваш знак зодиака Козерог");
    }
}





