package by.tms.task4;

import by.tms.task4.model.Figure;
import by.tms.task4.model.FigureType;
import by.tms.task4.model.ISquare;
import by.tms.task4.model.Line;
import by.tms.task4.model.Rectangle;
import by.tms.task4.model.Triangle;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = Rectangle.builder()
                              .sideA(2)
                              .sideB(3)
                              .build();
        figures[1] = Line.builder()
                         .lenght(1)
                         .build();
        figures[2] = Triangle.builder()
                             .height(5)
                             .base(2)
                             .build();
        for (Figure figure : figures) {
            if (figure.getType() != FigureType.LINE) {
                System.out.println("Figure area" + " " + figure.getType() + " = " + ((ISquare) figure).getSquare());
            }
        }
    }
}
