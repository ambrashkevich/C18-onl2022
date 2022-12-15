package clothes.pants;

public class NikePants implements IPants{
    @Override
    public void putOn() {
        System.out.println("Put on a nike pants");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off your nike pants");
    }
}
