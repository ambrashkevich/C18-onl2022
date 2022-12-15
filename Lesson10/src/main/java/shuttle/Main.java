package shuttle;

public class Main {
    public static void main(String[] args) {
        Cosmodrom cosmodrom = new Cosmodrom();
        cosmodrom.start(new Shuttle());
        System.out.println("........................");
        cosmodrom.start(new SpaceX());
        System.out.println("........................");
        cosmodrom.start(new RosCosmos());
        System.out.println("........................");
    }
}
