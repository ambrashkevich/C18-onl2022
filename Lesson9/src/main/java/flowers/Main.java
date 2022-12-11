package flowers;

import static flowers.Flower.getCount;
import static flowers.FlowerType.*;

public class Main {
    public static void main(String[] args) {
        FlowerMarket flowerMarket = new FlowerMarket();
        Bouquet[] bouquets = new Bouquet[5];
        bouquets[0] = flowerMarket.getBouquet(ROSE, GERBER,ASTER);
        for (Bouquet bouquet : bouquets) {
            System.out.println(bouquet);
            System.out.println("стоимость букета " + bouquet.getPrice());
            System.out.println("количество проданных цветов " + getCount());
        }
        System.out.println("выручка за день ");
    }
}

