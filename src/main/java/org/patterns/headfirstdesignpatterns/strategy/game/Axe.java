package org.patterns.headfirstdesignpatterns.strategy.game;

class Axe implements Weapon {

    @Override
    public void useWeapon() {
        System.out.println("Fighting with the Axe");
    }
}
