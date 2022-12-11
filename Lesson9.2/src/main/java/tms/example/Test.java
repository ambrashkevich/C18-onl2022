package tms.example;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Vehicle vh = new Vehicle();
        int km = 5000;
        vh.set();
        vh.range();
        vh.fuelneed(km);
    }
}
class Vehicle{
    int passengers, fuelcap, kml, rng;
    double fneed;
    String name = new String();
    Scanner sc = new Scanner(System.in);

    void set(){
        System.out.print("Vvedite imya avto: ");
        name = sc.nextLine();
        System.out.printf("Vvedite kol-vo passazhirov dlya %s: ", name);
        passengers = sc.nextInt();
        System.out.printf("Vvedite emkost toplivnogo baka dlya %s: ", name);
        fuelcap = sc.nextInt();
        System.out.printf("Vvedite rashod topliva dlya %s: ", name);
        kml = sc.nextInt();
    }

    void range(){
        rng = kml * fuelcap;
        System.out.printf("Dalnost poezdki transportnogo sredstva %s: %d\n", name, rng);
    }

    void fuelneed(int km){
        fneed = (double) km / kml;
        System.out.printf("Topliva nuzhno dlya %s: %.2f\n\n", name, fneed);
    }

}
