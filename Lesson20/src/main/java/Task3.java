import by.tms.model.Toy;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {
//      3) Создайте HashMap, содержащий пары значений - имя игрушки и объект игрушки (класс Toy).
//        Перебрать и распечатать набор из имен игрушек (keySet).
//        Перебрать и распечатать значения HashMap (values()).
//        Перебрать пары значений(entrySet()). Для каждого перебора создать свой метод(параметризованный)
        Toy toy = new Toy("Мишка", 100);
        Toy toy1 = new Toy("Лего", 200);
        Toy toy2 = new Toy("Робот", 300);
        Toy toy3 = new Toy("Машинка", 400);
        Toy toy4 = new Toy("Железная дорога", 500);
        Map<String, Toy> toyMap = Map.of(toy.getName(), toy,
                                         toy1.getName(), toy1,
                                         toy2.getName(), toy2,
                                         toy3.getName(), toy3,
                                         toy4.getName(), toy4);
        iterateValues(toyMap);
        iterateKeys(toyMap);
        iterateEntries(toyMap);
    }

    private static void iterateValues(Map<String, Toy> toyMap) {
        toyMap.values().forEach(System.out::println);
    }

    private static void iterateKeys(Map<String, Toy> toyMap) {
        toyMap.keySet().forEach(System.out::println);
    }

    private static void iterateEntries(Map<String, Toy> toyMap) {
        toyMap.entrySet().forEach(System.out::println);
    }
}
