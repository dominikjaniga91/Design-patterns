package org.patterns.headfirstdesignpatterns.strategy.game;

abstract class Character {

    private Weapon weapon;

    public Character(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void performFight() {
        this.weapon.useWeapon();
    }
}
