import java.text.ParseException;
import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) throws ParseException {
        /**
         * Основное задание
         * 1. Написать программу для вывода на консоль названия дня недели по
         * введенной дате.
         */
        LocalDate localDate = LocalDate.of(2023, 1, 5);
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("Day :" + " " + dayOfWeek);
    }
}



