//    11) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//       Массив имеет повторяющиеся элементы 3, 2
//       Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task11 {

    public static void main(String[] args) {
        int[] array1 = {0, 3, 46, 3, 2, 1, 2};
        int[] array2 = {0, 34, 46, 31, 20, 1, 28};
        System.out.println("Массив 1: " + (Arrays.toString(array1)));
        System.out.println("Массив 2: " + (Arrays.toString(array2)));
        List<Integer> array = new ArrayList<>();
        for (int k : array1) {
            if (array.contains(k)) {
                break;
            }
            for (int i : array2) {
                if (k == i) {
                    array.add(k);
                    break;
                }
            }
        }
        System.out.println("Массив имеет повторяющие элементы: " + array);
    }

}



