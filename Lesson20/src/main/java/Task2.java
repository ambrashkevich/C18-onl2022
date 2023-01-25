import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //2) Создать коллекцию, содержащую объекты HeavyBox.
        //        Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
        //         Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
        List<HeavyBox> heavyBoxList = List.of(new HeavyBox(100),
                new HeavyBox(200),
                new HeavyBox(350),
                new HeavyBox(250),
                new HeavyBox(650),
                new HeavyBox(400));
        List<HeavyBox> heavyBoxList1 = heavyBoxList.stream().filter(heavyBox -> heavyBox.getWeight() > 300).toList();
        System.out.println(heavyBoxList1);
    }

    @Getter
    @Setter
    @ToString
    private static class HeavyBox {
        private double weight;

        public HeavyBox(double weight) {
            this.weight = weight;
        }
    }
}
