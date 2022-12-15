
package transport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Military extends Air {
    private boolean catapult = true;
    private int numberOfMissiles = 3;


    @Override
    public String toString() {
        return "Military{" +
                "catapult=" + catapult +
                ", numberOfMissiles=" + numberOfMissiles +
                ", wingspan=" + getWingspan() +
                ", runwayLength=" + getRunwayLength() +
                ", power=" + getPower() +
                ", maxSpeed=" + getMaxSpeed() +
                ", mass=" + getMass() +
                ", brand='" + getBrand() + '\'' +
                ", kiloWats=" + getKiloWats() +
                '}';

    }

    public void catapultSystem() {
        if (catapult) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    public void shotRocket(int numberOfMissiles) {
        if (numberOfMissiles > 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }
}








