package transport;

public class Passenger extends Ground {
    String bodyType;
    int numberOfPassengers;

    @Override
    public String toString() {
        return "Passenger{" +
                "bodyType='" + bodyType + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", NumberOfWheels=" + NumberOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", mass=" + mass +
                ", brand='" + brand + '\'' +
                ", kiloWats=" + kiloWats +
                '}';

    }

    public void carPassed(String name, double consumption, double fuel_level, int maxSpeed) {         //бренд бак расход максимальная скорость
        double distance = fuel_level / consumption;    // топливо на расход
        double time = distance / maxSpeed;           // время t = s/v       t=время s=дистанция v=скорость
        System.out.println("За время" + " " + time + " " + "час " + "автомобиль" + " " + name + " " +
                "c максимальной скорость" + " " + maxSpeed + "км/ч " + " " + "проехал" + " " +
                distance * 100 + "км." + " " + "Израсходавно топлива" + " " + fuel_level);
    }

}




