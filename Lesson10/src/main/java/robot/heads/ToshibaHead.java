package robot.heads;

import abs.RobotParts;

public class ToshibaHead extends RobotParts implements IHead {

    public ToshibaHead(int price) {
        super(price);
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }
}
