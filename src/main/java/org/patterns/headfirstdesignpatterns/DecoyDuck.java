package org.patterns.headfirstdesignpatterns;

class DecoyDuck extends Duck {

    @Override
    void display() {
        System.out.println("Looks like decoy duck");
    }
}
