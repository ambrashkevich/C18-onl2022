package by.tms.task1;

import by.tms.task1.model.Drum;
import by.tms.task1.model.Guitar;
import by.tms.task1.model.IInstrument;
import by.tms.task1.model.Pipe;

import static by.tms.task1.model.IInstrument.Type.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Задача1:
         *       Интерфейс Инструмент
         *
         *       1) Создать интерфейс Инструмент(внутри enum Type с перечислением типов инструментов) и реализующие его классы Гитара, Барабан и Труба.
         *       2) Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
         *       3) Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
         *       4) Создать массив типа Инструмент, содержащий инструменты разного типа.
         *       5) Наполнять массив инструментами необходимо через метод createInstrument,
         *       который на вход принимает Тип инструмента(enum) и создает конкретный инструмент.
         *       6) В цикле вызвать метод play() для каждого инструмента, который должен выводить строку
         *       "Играет такой-то инструмент, с такими-то характеристиками".
         */

        for (IInstrument iInstrument : createInstruments(GUITAR, DRUM, PIPE)) {
            iInstrument.play();
            System.out.println();
        }
    }

    public static IInstrument[] createInstruments(IInstrument.Type... types) {
        IInstrument[] iInstruments = new IInstrument[types.length];
        for (int i = 0; i < types.length; i++) {
            if (types[i] == GUITAR) {
                iInstruments[i] = new Guitar(6);
            } else if (types[i] == DRUM) {
                iInstruments[i] = new Drum(50);
            } else {
                iInstruments[i] = new Pipe(10);
            }
        }
        return iInstruments;
    }
}