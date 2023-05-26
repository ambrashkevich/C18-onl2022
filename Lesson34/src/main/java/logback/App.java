package logback;

public class App {

    private static Order order;

    public static void main(String[] args) {
        order = new Order();
        order.doOrder();
    }
}
