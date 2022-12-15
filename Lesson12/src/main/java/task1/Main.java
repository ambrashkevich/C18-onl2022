package task1;

import task1.service.CarIsNotStarException;
import task1.model.Car;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", 100, 25000);
        try {
            mercedes.startCar();
        } catch (CarIsNotStarException e) {
            e.printStackTrace();
        }
        Car bmw = new Car("Bmw", 130, 35000);
        try {
            bmw.startCar();
        } catch (CarIsNotStarException e) {
            e.printStackTrace();
        }
        Car audi = new Car("Audi", 170, 45000);
        try {
            audi.startCar();
        } catch (CarIsNotStarException e) {
            e.printStackTrace();
        }
    }
}