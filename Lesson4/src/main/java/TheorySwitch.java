public class TheorySwitch {
    public static void main(String[] args) {
        int num = 8;
//        int num = 2;
        switch (num) {
            case 1:
                System.out.println("Номер 1");
                break;
            case 8:
                System.out.println("Номер 8");
                break;
            case 9:
                System.out.println("Номер 9");
                break;
            default:
                System.out.println("Это не номер 1,8 или 9");
        }
    }
}
