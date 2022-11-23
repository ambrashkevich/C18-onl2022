package by.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private final String cpu;
    private final String ram;
    private final String hdd;
    private int resource;


    public Computer(String cpu, String ram, String hdd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }


    public void on() {

        // Проверка на то, есть ли у компьютера ресурс включения-выключения
        if (resource != 0) {

            System.out.println("Внимание! Введите 0 или 1");
            // Объект для считывания ввода юзера
            Scanner sc = new Scanner(System.in);
            // Присваиваем ввод в переменную
            int userNum = sc.nextInt();


            // Создаем рандомное значение
            Random random = new Random();
            int randomNum = random.nextInt(2);

            // Если рандомное значение = введенному, то вырубаем компьютер
            if (userNum == randomNum) {
                // Т.к. каждое включение уменьшает ресурс то декрементим это поле
                resource--;
                off();
            } else {
                // Если нет, то компьютер сгорает т.е. его ресурс выработан и становится равен 0
                resource = 0;
            }

        } else { // Если ресурс = 0 то компьютер сгорел
            System.out.println("Компьютер сгорел!");
        }


    }

    public void off() {
        System.out.println("Выключение компьютера");
    }

    public int getResource() {
        return resource;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", resource=" + resource +
                '}';
    }
}
