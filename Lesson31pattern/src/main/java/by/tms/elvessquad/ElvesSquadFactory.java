package by.tms.elvessquad;

import by.tms.Archer;
import by.tms.SquadFactory;
import by.tms.Warrior;
import by.tms.Wizard;

public class ElvesSquadFactory implements SquadFactory {

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
