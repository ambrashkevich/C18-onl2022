package clothes.jacket;

public class NikeJacket implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Put on a nike jacket");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off your nike jacket");
    }
}
