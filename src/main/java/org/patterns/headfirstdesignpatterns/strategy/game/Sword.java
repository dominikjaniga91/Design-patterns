package org.patterns.headfirstdesignpatterns.strategy.game;

class Sword implements Weapon {

    @Override
    public void useWeapon() {
        System.out.println("Fighting with the sword");
    }
}
