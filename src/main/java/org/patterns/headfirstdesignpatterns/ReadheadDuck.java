package org.patterns.headfirstdesignpatterns;

class ReadheadDuck extends Duck {

    @Override
    void display() {
        System.out.println("Looks like readhead duck");
    }

    @Override
    void fly() {
        System.out.println("Readhead duck fly");
    }

    @Override
    void quack() {
        System.out.println("Quack from readhead duck");
    }
}
