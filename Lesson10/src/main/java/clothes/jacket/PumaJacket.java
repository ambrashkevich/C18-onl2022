package clothes.jacket;

public class PumaJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Put on a puma jacket");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off your puma jacket");
    }
}
