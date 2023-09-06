package org.patterns.headfirstdesignpatterns;

class RubberDuck extends Duck implements Quackable {

    @Override
    void display() {
        System.out.println("Looks like rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack from rubber duck");
    }
}
