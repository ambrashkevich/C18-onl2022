package by.tms.task4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class GasTank implements Serializable {
    private double volumeCount;
    private String oilType;

}
