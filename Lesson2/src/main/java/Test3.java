public class Test3 {

    public static void main(String[] args) {
        int[] mass = new int[5];
        mass[2] = 10;
        mass[4] = 11;
        System.out.println();
        int length = mass.length;
        int element = mass[--length];
        System.out.println(element);
        System.out.println(mass[--length]);


    }
}
