package org.patterns.headfirstdesignpatterns.strategy.game;

class Knife implements Weapon {

    @Override
    public void useWeapon() {
        System.out.println("Fighting with the knife");
    }
}
