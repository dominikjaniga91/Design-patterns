package org.patterns.headfirstdesignpatterns;

class MallardDuck extends Duck {

    @Override
    void display() {
        System.out.println("Looks like mallard duck");
    }

    @Override
    void fly() {
        System.out.println("Mallard duck fly");
    }

    @Override
    void quack() {
        System.out.println("Quack from mallard duck");
    }
}
