package by.tms;

import by.tms.orcsquad.OrcsSquadFactory;

public class OrcsArmy {

    public static void main(String[] args) {
        SquadFactory squadFactory = new OrcsSquadFactory();
        Archer archer = squadFactory.getArcher();
        Wizard wizard = squadFactory.getWizard();
        Warrior warrior = squadFactory.getWarrior();

        archer.shoot();
        wizard.conjures();
        warrior.fightingWithSwords();
    }
}
