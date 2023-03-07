package by.tms;

import by.tms.humanssquad.HumansSquadFactory;

public class HumansArmy {
    public static void main(String[] args) {
        SquadFactory squadFactory = new HumansSquadFactory();
        Archer archer = squadFactory.getArcher();
        Wizard wizard = squadFactory.getWizard();
        Warrior warrior = squadFactory.getWarrior();

        archer.shoot();
        wizard.conjures();
        warrior.fightingWithSwords();
    }
}

