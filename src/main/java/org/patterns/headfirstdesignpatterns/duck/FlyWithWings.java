package org.patterns.headfirstdesignpatterns.duck;

class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }
}
