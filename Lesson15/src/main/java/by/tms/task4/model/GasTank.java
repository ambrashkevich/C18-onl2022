package by.tms.task4.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GasTank implements Serializable {

    private double volumeCount;
    private String oilType;

}
