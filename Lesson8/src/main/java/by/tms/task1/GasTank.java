package by.tms.task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class GasTank {

    private int totalTankVolume;
    private double fuelQuantity;

    public GasTank(int totalTankVolume, double fuelQuantity) {
        this.totalTankVolume = totalTankVolume;
        this.fuelQuantity = fuelQuantity;
    }
}
