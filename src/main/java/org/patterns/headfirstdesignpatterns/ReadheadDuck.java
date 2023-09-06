package org.patterns.headfirstdesignpatterns;

class ReadheadDuck extends Duck implements Flyable, Quackable {

    @Override
    void display() {
        System.out.println("Looks like readhead duck");
    }

    @Override
    public void fly() {
        System.out.println("Readhead duck fly");
    }

    @Override
    public void quack() {
        System.out.println("Quack from readhead duck");
    }
}
