//     * 2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
package tms.example;

public class Task1 {
    public static void main(String[] args) {
        String word = "Hello world";
        System.out.println(word.replaceAll(word.substring(0, 1), word.substring(1, 2)));

    }
}
