//5. Создайте массив и заполните массив.
//Выведите массив на экран в строку.
//Замените каждый элемент с нечётным индексом на ноль.
//Снова выведете массив на экран на отдельной строке.
public class Task6 {

    public static void main(String[] args) {
        int[] value = new int[8];
        for (int i = 0; i < value.length; i++) {
            value[i] = (int) (Math.random() * 9 + 1);
            System.out.print(value[i] + " ");
        }
        for (int i = 0; i < value.length; i++) {
            if (value[i] % 2 != 0) {
                value[i] = 0;
                System.out.print(value[i] + "");
            }
        }
    }
}

