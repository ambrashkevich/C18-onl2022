package transport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Passenger extends Ground {
    private String bodyType;
    private int numberOfPassengers;

    @Override
    public String toString() {
        return "Passenger{" +
                "bodyType='" + bodyType + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", NumberOfWheels=" + getNumberOfWheels() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", power=" + getPower() +
                ", maxSpeed=" + getMaxSpeed() +
                ", mass=" + getMass() +
                ", brand='" + getBrand() + '\'' +
                ", kiloWats=" + getKiloWats() +
                '}';
    }

    public void carPassed(String name, double consumption, int maxSpeed, double time) { //На вход пришёл(Бренд, расход, максимальная скорость, время)
        double distance = maxSpeed * time;    // Расстояние
        double fuelLevel = distance * consumption / 100;  // Сколько топлива потратили
        System.out.println("За время" + " " + time + " " + "час " + "автомобиль" + " " + name + " " +
                "c максимальной скорость" + " " + maxSpeed + "км/ч " + " " + "проехал" + " " +
                distance + "км." + " " + "Израсходавно топлива" + " " + fuelLevel);
    }
}




