package transport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cargo extends Ground {
    private int liftingCapacity;
    @Override
    public String toString() {
        return "Cargo{" +
                "liftingCapacity=" + liftingCapacity +
                ", NumberOfWheels=" + getNumberOfWheels() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", power=" + getPower() +
                ", maxSpeed=" + getMaxSpeed() +
                ", mass=" + getMass() +
                ", brand='" + getBrand() + '\'' +
                ", kiloWats=" + getKiloWats() +
                '}';
    }
    public void capacity(int cargoValue) {
        if (liftingCapacity == cargoValue) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}

