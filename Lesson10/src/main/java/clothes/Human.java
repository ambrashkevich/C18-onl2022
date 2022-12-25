package clothes;

import clothes.jacket.IJacket;
import clothes.pants.IPants;
import clothes.shoes.IShoes;

public class Human implements IHuman {
    private String name;
    private IJacket iJacket;
    private IPants iPants;
    private IShoes iShoes;

    public Human(String name, IJacket iJacket, IPants iPants, IShoes iShoes) {
        this.name = name;
        this.iJacket = iJacket;
        this.iPants = iPants;
        this.iShoes = iShoes;
    }

    @Override
    public void putOn() {
        iJacket.putOn();
        iPants.putOn();
        iShoes.putOn();
    }

    @Override
    public void takeOff() {

    }
}
