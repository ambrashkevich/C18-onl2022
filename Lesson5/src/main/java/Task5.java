// 5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
////        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
public class Task5 {
    public static void main(String[] args) {
        int summ = summ(3, 4);
        System.out.println(summ);
    }

    private static int summ(int a, int b) {
        int result = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            result += Math.abs(a);
        }
        if (a < 0 && b > 0 || b < 0 && a > 0) {
            return -result;

        }

        return result;

    }
}

