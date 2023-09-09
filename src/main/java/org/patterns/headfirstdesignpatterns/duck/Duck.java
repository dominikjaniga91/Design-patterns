package org.patterns.headfirstdesignpatterns.duck;

abstract class Duck {

    private final FlyBehaviour flyBehaviour;
    private final QuackBehaviour quackBehaviour;

    Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    abstract void display();

    void performFly() {
        this.flyBehaviour.fly();
    }

    void performQuack() {
        this.quackBehaviour.quack();
    }
}
