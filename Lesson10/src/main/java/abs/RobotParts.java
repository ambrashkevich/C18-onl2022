package abs;

public abstract class RobotParts implements IPrice {
    private final int price;

    public RobotParts(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
