package robot;

import lombok.AllArgsConstructor;
import robot.hands.IHand;
import robot.heads.IHead;
import robot.legs.ILegs;

import lombok.Getter;

import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter


public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILegs leg;

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }


}
