public class Task3 {

    public static void main(String[] args) {

        int a = sum(50, 50);
        int b = sum(100, 100);
        System.out.println(a);
        System.out.println(b);
        System.out.println(sum(100, 200));
    }

    static int sum(int a, int b) {

        return a + b;

    }

}