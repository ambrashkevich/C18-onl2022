package robot.hands;

import abs.RobotParts;

public class ToshibaHand extends RobotParts implements IHand {

    public ToshibaHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднялась рука с логотипом Toshiba");
    }
}
