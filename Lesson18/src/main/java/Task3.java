import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        // 3. Создать обобщенный функциональный интерфейс.
        //     * Написать класс с одним методом.
        //     * В этом методе реализуйте логику:
        //     * - если в консоль введена цифра 1, то: использования интерфейса со
        //     * строковым типом и передать в метод интерфейса логику реверса
        //     * строки(вывода строки в обратном порядке).
        //     * - если в консоль введена цифра 2, то: использования интерфейса с
        //     * целочисленным типом и передать в метод интерфейса логику
        //     * нахождения факториала числа.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру:");
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Введите строку: ");
            String input2 = scanner.next();
            FunctionalInterface<String> functionalInterface = a -> new StringBuilder(a).reverse().toString();
            System.out.println("reversed string: " + functionalInterface.apply(input2));
        } else if (input == 2) {
            System.out.println("Введите число");
            BigInteger input2 = scanner.nextBigInteger();
            FunctionalInterface<BigInteger> functionalInterface = n -> IntStream.
                    rangeClosed(2, n.intValue()).
                    parallel().mapToObj(BigInteger::valueOf).
                    reduce(BigInteger::multiply).get();
            System.out.println("factorial of " + input2 + " is: " + functionalInterface.apply(input2));
        } else {
            System.out.println("Неправильные данные");
        }
    }
}
