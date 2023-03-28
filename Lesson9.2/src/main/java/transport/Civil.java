package transport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Civil extends Air {

    private int numberOfPassengers;
    private boolean business;

    @Override
    public String toString() {
        return "Civil{" +
                "numberOfPassengers=" + numberOfPassengers +
                ", business=" + business +
                ", wingspan=" + getWingspan() +
                ", runwayLength=" + getRunwayLength() +
                ", power=" + getPower() +
                ", maxSpeed=" + getMaxSpeed() +
                ", mass=" + getMass() +
                ", brand='" + getBrand() + '\'' +
                ", kiloWats=" + getKiloWats() +
                '}';
    }

    public void capacityOfPassengers(int places) {
        if (numberOfPassengers == places) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Нужен самолёт побольше");
        }
    }
}
