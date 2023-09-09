package org.patterns.headfirstdesignpatterns.duck;

class RubberDuck extends Duck {

    public RubberDuck() {
        super(new NoFly(), new Quack());
    }

    @Override
    void display() {
        System.out.println("Looks like rubber duck");
    }

}
