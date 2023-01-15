import by.tms.model.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Task5 {
    /**
     * 5) Задан список сотрудников, которые хранятся в коллекции List<p3.Person>.
     * Объект p3.Person содержит имя и фамилию(по желанию другие данные)
     * a) написать метод, который отображает все фамилии, начинающиеся на букву "Д".
     * Внимание! метод должен вернуть объект Optional<String>.
     * b*)Со звездочкой. Написать метод, который будет выводить в столбик первую букву фамилии и рядом количество сотрудников,
     * у которых фамилия начинается с этой буквы.
     * Пример: Антонов, Петров, Сидоров, Александров...
     * на экран выведет:
     * A - 2 сотрудника
     * П - 1 сотрудник
     * С - 1 сотрудник
     */
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Вадим", "Амбрашкевич", 21));
        people.add(new Person("Иван", "Девелопер", 21));
        people.add(new Person("Антон", "Дмитриев", 21));
        people.add(new Person("Дмитрий", "Дианов", 21));
        people.add(new Person("Макс", "Миронь", 18));

        System.out.println(getSortedSurname(people));
        getNumberOfEmployeesByFirstLetter(people).forEach(System.out::println);
    }

    public static Optional<String> getSortedSurname(List<Person> people) {
        return people.stream()
                .map(Person::getSurName)
                .filter(name -> name.startsWith("Д"))
                .reduce((left, right) -> left + " " + right);
    }

    public static Set<Map.Entry<Character, Long>> getNumberOfEmployeesByFirstLetter(List<Person> employees) {
        Map<Character, Long> resultList = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getSurName().charAt(0), Collectors.counting()));
        return resultList.entrySet();
    }
}
