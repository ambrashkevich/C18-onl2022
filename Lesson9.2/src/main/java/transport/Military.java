package transport;

public class Military extends Air {
    boolean catapult = true;
    int numberOfMissiles = 3;

    @Override
    public String toString() {
        return "Military{" +
                "catapult=" + catapult +
                ", numbeOfMissiles=" + numberOfMissiles +
                ", wingspan=" + wingspan +
                ", runwayLength=" + runwayLength +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", mass=" + mass +
                ", brand='" + brand + '\'' +
                ", kiloWats=" + kiloWats +
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
        if (numberOfMissiles != 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }
}








