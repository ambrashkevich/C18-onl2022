//Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения символа(B).
package tms.example;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        String words = "Hello world";
        String subWord = words.substring(0,5);
        System.out.println(subWord);
    }
}
