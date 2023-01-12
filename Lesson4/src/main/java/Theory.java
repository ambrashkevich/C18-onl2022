public class Theory {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 6;
        if (num1 > num2) {
            System.out.println("Больше");
        } else if (num1 < num2) {
            System.out.println("Меньше");
        } else {
            System.out.println("равны");
        }
        int num3 = 8;
        int num4 = 6;
        if (num3 > num4 && num3 > 7) {
            System.out.println("Первое число больше второго и 7");         //Конструкции if ... else
        }

        int nums = 8;
        int nums1 = 6;
        String result = nums > nums1 ? "nums > nums1" : "nums < nums1";
        System.out.println(result);
    }
}
