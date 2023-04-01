package by.tms;

import by.tms.model.Toy;
import by.tms.service.MapIteration;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Toy> toyMap = new HashMap<>();
        fillMap(toyMap);
        System.out.println("Используем keySet():");
        MapIteration.printByKeySet(toyMap);
        System.out.println("Используем values():");
        MapIteration.printByValues(toyMap);
        System.out.println("Используем entrySet():");
        MapIteration.printByEntrySet(toyMap);
    }

    public static void fillMap(Map<String, Toy> toyMap) {
        toyMap.put("Bear", new Toy("Bear", 220));
        toyMap.put("Car", new Toy("Car", 500));
        toyMap.put("Robot", new Toy("Robot", 200));
        toyMap.put("Сonstructor", new Toy("Сonstructor", 90));
        toyMap.put("Helicopter", new Toy("Helicopter", 100));
    }
}

