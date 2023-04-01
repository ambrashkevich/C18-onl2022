package robot;

import robot.hands.IHand;
import robot.hands.SamsungHand;
import robot.hands.SonyHand;
import robot.hands.ToshibaHand;
import robot.heads.IHead;
import robot.heads.SamsungHead;
import robot.heads.SonyHead;
import robot.heads.ToshibaHead;
import robot.legs.ILegs;
import robot.legs.SamsungLeg;
import robot.legs.SonyLeg;
import robot.legs.ToshibaLeg;

public class Run {

    public static void main(String[] args) {
        IHead[] heads = new IHead[3];
        heads[0] = new SamsungHead(5300);
        heads[1] = new SonyHead(5680);
        heads[2] = new ToshibaHead(4900);
        IHand[] hands = new IHand[3];
        hands[0] = new ToshibaHand(3200);
        hands[1] = new SamsungHand(4050);
        hands[2] = new SonyHand(3600);
        ILegs[] legs = new ILegs[3];
        legs[0] = new SonyLeg(4300);
        legs[1] = new SamsungLeg(4000);
        legs[2] = new ToshibaLeg(3760);

        IRobot[] robots = new IRobot[3];
        int maxPrice = Integer.MIN_VALUE;
        int maxPriceIndex = -1;
        for (int i = 0; i < 3; i++) {
            robots[i] = new Robot(heads[i], hands[i], legs[i]);
            robots[i].action();
            System.out.println();
            int price = robots[i].getPrice();
            if (price > maxPrice) {
                maxPriceIndex = i;
                maxPrice = price;
            }
        }
        Robot maxPriceRobot = (Robot) robots[maxPriceIndex];
        System.out.printf("Самый дорогой робот стоит %d у.е. и состоит из головы %s, рук %s и ног %s \n", maxPrice,
                          maxPriceRobot.getHead().getClass().getSimpleName(),
                          maxPriceRobot.getHand().getClass().getSimpleName(),
                          maxPriceRobot.getLeg().getClass().getSimpleName());
    }

}


