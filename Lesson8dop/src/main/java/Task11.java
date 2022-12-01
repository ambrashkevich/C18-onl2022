//5. Создайте двумерный массив. Выведите на консоль диагонали массива.


public class Task11 {
    public static void main(String[] args) {
        int n = 4;
        int[][] a = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};
        printPrincipalDiagonal(a, n);
        printSecondaryDiagonal(a, n);
    }

    public static void printPrincipalDiagonal(int[][] a, int n) {
        System.out.print("Первая диагональ: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][i] + ", ");
        }
        System.out.println();
    }

    public static void printSecondaryDiagonal(int[][] a, int n) {
        System.out.print("Вторая диагональ: ");
        int k = n - 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][k--] + ", ");
        }
        System.out.println();
    }


}





