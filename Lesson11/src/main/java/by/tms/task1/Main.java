package by.tms.task1;

import static by.tms.task1.model.IInstrument.Type.DRUM;
import static by.tms.task1.model.IInstrument.Type.GUITAR;
import static by.tms.task1.model.IInstrument.Type.PIPE;

import by.tms.task1.model.Drum;
import by.tms.task1.model.Guitar;
import by.tms.task1.model.IInstrument;
import by.tms.task1.model.Pipe;

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

        for (IInstrument instrument : createInstruments(GUITAR, DRUM, PIPE)) {
            instrument.play();
            System.out.println();
        }
    }

    public static IInstrument[] createInstruments(IInstrument.Type... types) {
        IInstrument[] instruments = new IInstrument[types.length];
        for (int i = 0; i < types.length; i++) {
            if (types[i] == GUITAR) {
                instruments[i] = new Guitar(6);
            } else if (types[i] == DRUM) {
                instruments[i] = new Drum(50);
            } else {
                instruments[i] = new Pipe(10);
            }
        }
        return instruments;
    }
}