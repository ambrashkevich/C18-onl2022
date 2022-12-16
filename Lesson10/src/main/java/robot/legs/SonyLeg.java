package robot.legs;

import abs.RobotParts;

public class SonyLeg extends RobotParts implements ILegs {

    public SonyLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Нога Sony сделала шаг");
    }
}
