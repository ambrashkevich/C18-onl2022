package flowers;

public class FlowerMarket {

    public Bouquet getBouquet(FlowerType... flowers) {
        Flower[] resultFlowers = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            resultFlowers[i] = new Flower(flowers[i]);
        }
        return new Bouquet(resultFlowers);
    }
}
