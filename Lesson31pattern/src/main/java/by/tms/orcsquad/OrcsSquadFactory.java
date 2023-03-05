package by.tms.orcsquad;

import by.tms.Archer;
import by.tms.GameFactory;
import by.tms.Warrior;
import by.tms.Wizard;

public class OrcsSquadFactory implements GameFactory {
    @Override
    public Archer getArcher() {
        return new OrcsArchers();
    }

    @Override
    public Warrior getWarrior() {
        return new OrcsWarriors();
    }

    @Override
    public Wizard getWizard() {
        return new OrcsWizards();
    }
}
