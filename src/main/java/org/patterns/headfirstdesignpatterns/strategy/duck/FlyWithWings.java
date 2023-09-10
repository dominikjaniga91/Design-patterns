package org.patterns.headfirstdesignpatterns.strategy.duck;

class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }
}
