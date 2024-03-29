package tms.example;

import by.tms.utils.PatternUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
     * По строкам дополнительная!
     *  1) Даны строки разной длины c четным числом символов(казаки, просмотреть и так далее),
     *  необходимо вернуть ее два средних знака.
     * Например, если дана строка "string"  результат будет "ri", для строки "code" результат "od",  для "Practice" результат "ct".
     *
     *
     * По  регулярным выражениям!
     * 2) Дана строка "cab, ccab, cccab" Необходимо составить регулярное выражение, сделать класс Pattern, Matcher, вызвать метод find и вывести слова на консоль
     * Должно вывести:
     * cab
     * ccab
     * cccab
     *
     * 3) Дана строка "Versions: Java  5, Java 6, Java   7, Java 8, Java 12."  Найти все подстроки "Java X", где X - число и распечатать их.
     *
     * 4*)со звездочкой! Предложение состоит из нескольких слов, разделенных пробелами. Например: "One two three раз два три one1 two2 123 ".
     *  Найти количество слов, содержащих только символы латинского алфавита.
     *  Необходимо составить регулярное выражение и вызвать его в методе split(Regexp)
     *  String str = "One two three раз два три one1 two2 123 ";
     *  System.out.println(str.split("регулярное выражение").length);
     *  Подсказка: тут надо использовать:
     *  1) группы ()
     *  2) | - оператор или
     *  3) [] - группировки символов
     *  4) +,* - квантификаторы
     *
     *  PS: Кто не сможет осилить регулярное выражение, то сделайте как сможете!
     *
     *  5*)со звездочкой! В метод на вход приходит строка
     *
     *  public static boolean validate(String str) {
            return false;
        }
     * Необходимо выполнить проверку на валидацию входящей строки и вернуть false или true
     * - Строка должна содержать только маленькие латинские буквы и цифры 1 или 5 без знака подчеркивания.
     * - Длина строки должна быть от 4 до 20 символов.
     *
     * PS: нужно посмотреть презентацию страница 44 (Метасимволы для группировки символов)
     * */
        {
            String text = "Versions: Java  5, Java 66, has, Java 7, Java 8, Java 12, Java EE 8,Java 8.2, Java 2.";
            Pattern pattern = Pattern.compile("Java\\s+[0-9]+");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println(text.substring(matcher.start(), matcher.end()));
            }
        }
        {

            String[] words = {"string", "code", "Practice"};
            for (String word : words) {
                System.out.printf("%s --> \"%s\"%n", word, word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
            }
        }
        {
            Pattern pattern = Pattern.compile("a*b");
            Matcher matcher = pattern.matcher("aaab");
            boolean b = matcher.matches();
            System.out.println(b);

        }
        {
            String text = "cab, ccab, cccab";
            Matcher matcher = PatternUtils.PATTERN.matcher(text);
            while (matcher.find()) {
                System.out.println(text.substring(matcher.start(), matcher.end()));
            }
            {
                String str = "One two three раз два три one1 two2 123 ";
                System.out.println(str.split("\\s+|([а-яА-Я]+)|([a-zA-Z]*[0-9])").length);
            }

        }
    }
}





