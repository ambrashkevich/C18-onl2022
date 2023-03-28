package by.tms.task4.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Engine implements Serializable {

    private String engineType;
    private int countCylinders;
}
