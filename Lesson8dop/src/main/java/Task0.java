//Создайте массив строк. Заполните его произвольными именами
//людей.

import java.util.Arrays;

public class Task0 {
    public static void main(String[] args) {
        String[] names = new String[]
                {
                        "Vadim",
                        "Max",
                        "Natasha",
                        "Pasha",
                        "Anton"

                };
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}

