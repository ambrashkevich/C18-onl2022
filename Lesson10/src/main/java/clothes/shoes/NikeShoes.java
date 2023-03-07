package clothes.shoes;

public class NikeShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Put on a nike shoes");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off your nike shoes");
    }
}
