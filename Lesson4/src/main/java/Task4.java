import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random time = new Random();
        int a = time.nextInt(28800), b = a / 60 / 60;
        System.out.println("Секунд осталось " + a);
        switch (b) {
            case 0:
                System.out.println("До конца рабочего дня осталось меньше часа");
                break;
            case 1:
                System.out.println("Остался " + b + " час");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Осталось " + b + " часа");
                break;
            default:
                System.out.println("Осталось " + b + " часов");
        }
    }
}

