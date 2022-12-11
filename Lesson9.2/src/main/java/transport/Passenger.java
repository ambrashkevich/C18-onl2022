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
}

