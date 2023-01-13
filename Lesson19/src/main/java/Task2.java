import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {
    //Определение количества четных чисел в потоке данных.
    //  Создаем коллекцию Set<Integer> в которую добавляем рандомно 50 чисел от 0 до 100
    private static Set<Integer> getRandomSet(int count) {
        return new Random()
                .ints(0, 100)
                .distinct()
                .limit(count)
                .boxed()
                .collect(Collectors.toSet());
    }
}
