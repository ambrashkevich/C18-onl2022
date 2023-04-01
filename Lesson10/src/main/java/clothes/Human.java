package clothes;

import clothes.jacket.IJacket;
import clothes.pants.IPants;
import clothes.shoes.IShoes;

public class Human implements IHuman {

    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String name, IJacket iJacket, IPants iPants, IShoes iShoes) {
        this.name = name;
        this.jacket = iJacket;
        this.pants = iPants;
        this.shoes = iShoes;
    }

    @Override
    public void putOn() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOff() {

    }
}
