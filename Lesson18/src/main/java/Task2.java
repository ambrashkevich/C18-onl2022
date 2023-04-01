import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Task2 {

    public static void main(String[] args) {
/**
 * 2. Написать программу для вывода на экран дату следующего вторника.
 */
        LocalDate date = LocalDate.now();
        System.out.println("\nСледующий вторник: " + date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        System.out.println("Предыдущий вторник: " + date.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)) + "\n");
    }
}
