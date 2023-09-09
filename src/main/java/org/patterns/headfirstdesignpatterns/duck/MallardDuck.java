package org.patterns.headfirstdesignpatterns.duck;

class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    void display() {
        System.out.println("Looks like mallard duck");
    }
}
