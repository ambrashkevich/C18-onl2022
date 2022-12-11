package transport;

public class Civil extends Air {
    int numberOfPassengers = 24;
    boolean business;

    @Override
    public String toString() {
        return "Civil{" +
                "numberOfPassengers=" + numberOfPassengers +
                ", business=" + business +
                ", wingspan=" + wingspan +
                ", runwayLength=" + runwayLength +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", mass=" + mass +
                ", brand='" + brand + '\'' +
                ", kiloWats=" + kiloWats +
                '}';
    }

    public void capacityOfPassengers(int places ) {
        if (numberOfPassengers == places) {
            System.out.println("Самолёт загружен");
        }else {
            System.out.println("Нужен самолёт побольше");
        }
    }
}
