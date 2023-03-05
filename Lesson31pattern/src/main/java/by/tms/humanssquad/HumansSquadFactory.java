package by.tms.humanssquad;

import by.tms.Archer;
import by.tms.GameFactory;
import by.tms.Warrior;
import by.tms.Wizard;

public class HumansSquadFactory implements GameFactory {
    @Override
    public Archer getArcher() {
        return new HumansArchers();
    }

    @Override
    public Warrior getWarrior() {
        return new HumansWarriors();
    }

    @Override
    public Wizard getWizard() {
        return new HumansWizards();
    }
}
