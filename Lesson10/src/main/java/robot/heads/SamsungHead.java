package robot.heads;

import abs.RobotParts;

public class SamsungHead extends RobotParts implements IHead {

    public SamsungHead(int price) {
        super(price);
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung");
    }
}
