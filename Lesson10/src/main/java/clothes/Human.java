package clothes;

import clothes.jacket.IJacket;
import clothes.pants.IPants;
import clothes.shoes.IShoes;

public class Human implements IHuman {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    @Override
    public void PutOn() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void TakeOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
