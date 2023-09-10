package org.patterns.headfirstdesignpatterns.strategy.duck;

class DecoyDuck extends Duck {

    DecoyDuck() {
        super(new NoFly(), new NoQuack());
    }

    @Override
    void display() {
        System.out.println("Looks like decoy duck");
    }
}
