package clothes.pants;

public class GucciPants implements IPants {

    @Override
    public void putOn() {
        System.out.println("Put on a gucci pants");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off your gucci pants");
    }
}
