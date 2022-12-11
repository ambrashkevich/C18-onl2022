package transport;

public class Transport {
    int power = 5;
   public int maxSpeed = 100;
    double mass;
    String brand = "BMW";
    double kiloWats = 0.74;

    private double calcKilowatts(){
        return power * kiloWats;
    }
}
