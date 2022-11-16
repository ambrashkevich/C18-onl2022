import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
//       System.out.println(operation(1));
//       System.out.println(operation(0));
//       System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
//      countDevs(103);
//       countDevs(12);
//        foobar(6);
//        foobar(10);
//        foobar(15);
//       printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
            } else {
                System.out.println("Ошибка");
                scanner.next();
            }
        } while (count <= 0);
        System.out.println(count);
    }


    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }


    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int i : ints) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
        // т а а а в         в                                т

        int c10 = count % 10; //34%10=4
        int c100 = count % 100; // 11 % 100  = 11
        if (c10 == 1 && c100 != 11) {
            System.out.println("Программист");
        } else if ((c10 >= 2 && c10 <= 4) && !(c100 >= 12 && c100 <= 14)) {
            System.out.println("Программиста");
        } else {
            System.out.println("Программистов");
        }
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if (number % 3 == 0) {
            System.out.print("foo");
        }
        if (number % 5 == 0) {
            System.out.print("bar");
        }
        System.out.println();
    }


    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                count++;
                System.out.println(i + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }

}



