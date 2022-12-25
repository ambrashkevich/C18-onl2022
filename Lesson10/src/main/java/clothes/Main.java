package clothes;

import clothes.jacket.GucciJacket;
import clothes.jacket.NikeJacket;
import clothes.jacket.PumaJacket;
import clothes.pants.GucciPants;
import clothes.pants.NikePants;
import clothes.pants.PumaPants;
import clothes.shoes.GucciShoes;
import clothes.shoes.NikeShoes;
import clothes.shoes.PumaShoes;

public class Main {
    public static void main(String[] args) {
        /*
          По аналогии с первым задание делаем след. задание.
          Интерфейсы:
          - Куртка
          - Штаны
          - Обувь
          в каждом интерфейсе есть 2 метода (надеть и снять)
          Делаем несколько реализации каждого интерфейса.
          Создаём класс человек:
          У человека поля:
          -имя
          -куртка
          -штаны
          -обувь
          У человека есть 2 метода:
          - одеться(вызываются методы надетьдеть у всех вещей)
          - раздеться (вызываются методы снять у всех вещей)
         */
        Human human1 = new Human("Vadim", new PumaJacket(), new GucciPants(), new GucciShoes());
        human1.putOn();
        human1.takeOff();
        System.out.println("                                                         ");
        Human human2 = new Human("Max", new NikeJacket(), new PumaPants(), new NikeShoes());
        human2.putOn();
        human2.takeOff();
        System.out.println("                                                         ");
        Human human3 = new Human("Alex", new GucciJacket(), new NikePants(), new PumaShoes());
        human3.putOn();
        human3.takeOff();
        System.out.println("                                                         ");
    }
}
