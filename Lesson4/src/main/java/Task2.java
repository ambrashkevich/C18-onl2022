import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count;
        System.out.print("Введите целое число:");
        count = in.nextInt();
        if (count % 2 == 0) {
            System.out.println("Число" + " " + count + " " + "является чётным:");
        } else {
            System.out.println("Число нечётное");
        }
    }
}
