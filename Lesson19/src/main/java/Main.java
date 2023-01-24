import by.tms.model.Car;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //  1) Вывести список чисел, умноженных на 2. Список чисел задаем рандомно.
        int size = 10;
        int min = 1;
        int max = 10;
        List<Integer> randList = new Random().ints(size, min, max)
                .boxed().collect(Collectors.toList());
        for (Integer i : randList) {
            System.out.println(i * 2);
        }
        System.out.println(randList);

        // 2) Определение количества четных чисел в потоке данных.
        //     * Создаем коллекцию Set<Integer> в которую добавляем рандомно 50 чисел от 0 до 100
        ArrayList<Integer> arrayList = new ArrayList<>();
        int number;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            number = random.nextInt() % 100;
            arrayList.add(number);
        }
        Stream<Integer> st = arrayList.stream();
        Predicate<Integer> fn;
        fn = (n) -> (n % 2) == 0;
        Stream<Integer> resStream = st.filter(fn);
        System.out.println(arrayList);
        System.out.println("n = " + resStream.count());

        //3) Вывести список имен, но с первой заглавной буквой. список имен: "john", "arya", "sansa"
        List<String> names = Arrays.asList("john", "arya", "sansa");
        names.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println);

        //4) Создаем класс Car с полями number (номер авто) и year (год выпуска).
        //Необходимо вывести все не пустые номера машин, выпущенных после 2010 года
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car(" ", 2015),
                new Car("AI3838PP", 2017));
        cars.stream()
                .filter(car -> car.getYear() > 2010)
                .map(Car::getNumber)
                .filter(s -> s != null && !s.isEmpty())
                .forEach(System.out::println);
    }
}




