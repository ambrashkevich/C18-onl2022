package by.tms;

public interface GameFactory {
    Archer getArcher();

    Warrior getWarrior();

    Wizard getWizard();
}
