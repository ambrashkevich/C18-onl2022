import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число (Пример 1 2 3 4 5 6 ...): ");
        String numbers = new Scanner(System.in).nextLine();
        Set<String> number = new HashSet<>(Arrays.asList(numbers.split(" ")));
        System.out.println(number);
    }
}
