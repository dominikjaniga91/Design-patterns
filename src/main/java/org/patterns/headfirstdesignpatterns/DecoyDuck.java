package org.patterns.headfirstdesignpatterns;

class DecoyDuck extends Duck {

    @Override
    void display() {
        System.out.println("Looks like decoy duck");
    }

    @Override
    void fly() {
        throw new NotSupportOperationException("Method not supported");
    }

    @Override
    void quack() {
        throw new NotSupportOperationException("Method not supported");
    }
}
