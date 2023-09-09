package org.patterns.headfirstdesignpatterns.duck;

class ReadheadDuck extends Duck {

    public ReadheadDuck() {
        super(new FlyWithWings(), new Squeak());
    }

    @Override
    void display() {
        System.out.println("Looks like readhead duck");
    }
}
