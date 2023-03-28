package by.tms;

import by.tms.elvessquad.ElvesSquadFactory;

public class ElvesArmy {

    public static void main(String[] args) {
        SquadFactory squadFactory = new ElvesSquadFactory();
        Archer archer = squadFactory.getArcher();
        Wizard wizard = squadFactory.getWizard();
        Warrior warrior = squadFactory.getWarrior();

        archer.shoot();
        wizard.conjures();
        warrior.fightingWithSwords();
    }
}
