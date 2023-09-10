package org.patterns.headfirstdesignpatterns.strategy.game;

class BowAndArrow implements Weapon {

    @Override
    public void useWeapon() {
        System.out.println("Fighting with the bow and arrow");
    }
}
