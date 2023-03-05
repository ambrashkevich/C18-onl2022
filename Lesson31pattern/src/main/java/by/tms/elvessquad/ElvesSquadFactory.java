package by.tms.elvessquad;

import by.tms.Archer;
import by.tms.GameFactory;
import by.tms.Warrior;
import by.tms.Wizard;

public class ElvesSquadFactory implements GameFactory {
    @Override
    public Archer getArcher() {
        return new ElvesAchers();
    }

    @Override
    public Warrior getWarrior() {
        return new ElvesWarriors();
    }

    @Override
    public Wizard getWizard() {
        return new ElvesWizards();
    }
}
