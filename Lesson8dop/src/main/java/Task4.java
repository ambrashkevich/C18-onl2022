//Создайте 2 массива из 5 чисел.
//Выведите массивы на консоль в двух отдельных строках.
//Посчитайте среднее арифметическое элементов каждого массива и
//сообщите, для какого из массивов это значение оказалось больше (либо
//сообщите, что их средние арифметические равны).
public class Task4 {

    public static void main(String[] args) {
        double sumNumberFirst = 0;
        double sumNumberTwo = 0;
        sumNumberFirst = getSumNumberFirst(sumNumberFirst);
        sumNumberTwo = getSumNumberFirst(sumNumberTwo);
        if (sumNumberFirst == sumNumberTwo) {
            System.out.println("Средние арифметические значения двух массивов равны");
        } else if (sumNumberFirst > sumNumberTwo) {
            System.out.println("Среднее арифметическое значение первого массива больше и равно ");
        } else {
            System.out.println("Среднее арифметическое значение второго массива больше и равно ");
        }
    }

    private static double getSumNumberFirst(double sumNumberFirst) {
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 6);
            System.out.print(array1[i] + " ");
            sumNumberFirst += (double) array1[i] / array1.length;
        }
        System.out.println(" ");
        return sumNumberFirst;
    }
}
