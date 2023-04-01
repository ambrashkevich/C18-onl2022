package clothes.shoes;

public class PumaShoes implements IShoes {

    @Override
    public void putOn() {
        System.out.println("Put on a puma shoes");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off your puma shoes");
    }
}
