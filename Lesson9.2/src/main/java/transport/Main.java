package transport;

public class Main {
    public static void main(String[] args) {
        Military military = new Military();
        military.catapultSystem();
        military.shotRocket(0);

        Cargo cargo = new Cargo();
        cargo.capacity(101);

        Civil civil = new Civil();
        civil.capacityOfPassengers(23);
    }

}
