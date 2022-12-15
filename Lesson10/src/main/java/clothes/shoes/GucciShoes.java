package clothes.shoes;

public class GucciShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Put on a gucci shoes");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off your gucci shoes");
    }
}
