package org.patterns.headfirstdesignpatterns;

class RubberDuck extends Duck {

    @Override
    void display() {
        System.out.println("Looks like rubber duck");
    }

    @Override
    void fly() {
        throw new NotSupportOperationException("Method not supported");
    }

    @Override
    void quack() {
        System.out.println("Quack from rubber duck");
    }
}
