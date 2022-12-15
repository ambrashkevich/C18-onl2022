//Задачи:
//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int day;
        day = random.nextInt(7) + 1;
        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота-выходной");
            case 7 -> System.out.println("Воскресенье-выходной");
        }
    }
}



