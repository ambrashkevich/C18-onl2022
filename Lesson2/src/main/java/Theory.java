public class Theory {
    public static void main(String[] args) {
        System.out.println("Hello git!");
        int a = 4;
        byte b = (byte) a; //преобразование базовых типов данных

        double c = 56.9898;
        int d = (int) c;

        int e = (int) Math.round(c); //Усечение рациональных чисел до целых

        int aa = 2;
        double bb = 5.4;
        double s = aa + bb;
        System.out.println(s); //преобразование если одно значение равно типу double, то и другое в том числе
        // значит aa + bb будет относится к типу double

        byte cc = 4;
        short ccc = 2;
        byte cs = (byte) (cc + ccc);
        System.out.println(cs); //Преобразование при операциях

        int b1 = 2;
        int b2 = 5;
        System.out.println(b1 & b2);//Логическое умножение (И)


        int a1 = 2;
        int a2 = 3;
        System.out.println(a1 & a2); //Логическое умножение(И)


        int aa1 = 2;
        int aa2 = 5;
        System.out.println(aa1 | aa2); //Логическое сложение (ИЛИ)

        int bbb1 = 4;
        int bbb2 = 5;
        System.out.println(bbb1 | bbb2); //Логическое сложение (ИЛИ)

        int number = 45;
        int key = 102;
        int encrypt = number ^ key;
        System.out.println("Зашифрованное число:" + " " + encrypt);  //Логическое исключающее (ИЛИ)

        int decrypt = encrypt ^ key;
        System.out.println("Расшифрованное число:" + " " + decrypt); //Логическое исключающее (ИЛИ)

        byte a3 = 12;
        System.out.println(~a3); //Логическое отрицание

        boolean c1 = (b1 > b2) && (bbb1 > bbb2); // Операции сравнения
        System.out.println(c1);
    }
}
