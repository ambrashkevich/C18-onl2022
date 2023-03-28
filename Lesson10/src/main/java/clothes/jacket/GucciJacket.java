package clothes.jacket;

public class GucciJacket implements IJacket {

    @Override
    public void putOn() {
        System.out.println("Put on a gucci jacket");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off your gucci jacket");
    }
}
