package clothes.pants;

public class PumaPants implements IPants{
    @Override
    public void putOn() {
        System.out.println("Put on a puma pants");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off your puma pants");
    }
}
