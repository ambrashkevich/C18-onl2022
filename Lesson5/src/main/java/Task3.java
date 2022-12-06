// В переменную записываем число.
////        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
////        Например, Введите число: 5
////        "5 - это положительное число, количество цифр = 1"
public class Task3 {
    public static void main(String[] args) {
        int value = -1;
        if (value > 0) {
            System.out.println("Число положительно");

            int length = (int) (Math.log10(value) + 1);
            System.out.println("Количество чисел " + length);
        } else if (value < 0) {
            System.out.println("Число отрицательное");

            int numbersCount = String.valueOf(value).length();
            System.out.println("Количество чисел " + numbersCount);
        }


    }

}

