package transport;

public class Cargo extends Ground {
    int liftingCapacity = 100;

    @Override
    public String toString() {
        return "Cargo{" +
                "liftingCapacity=" + liftingCapacity +
                ", NumberOfWheels=" + NumberOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", mass=" + mass +
                ", brand='" + brand + '\'' +
                ", kiloWats=" + kiloWats +
                '}';
    }
        public void capacity(int cargoValue){
            if (liftingCapacity == cargoValue){
                System.out.println("Грузовик загружен");
            } else {
                System.out.println("Вам нужен грузовик побольше");
            }
        }
    }

