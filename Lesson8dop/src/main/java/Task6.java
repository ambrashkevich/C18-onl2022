//5. Создайте массив и заполните массив.
//Выведите массив на экран в строку.
//Замените каждый элемент с нечётным индексом на ноль.
//Снова выведете массив на экран на отдельной строке.
public class Task6 {

    public static void main(String[] args) {
        int[] Mas = new int[8];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(Mas[i] + " ");
        }
        for (int i = 0; i < Mas.length; i++) {
            if (Mas[i] % 2 != 0) Mas[i] = 0;
            System.out.print(Mas[i] + "");
        }
    }
}

