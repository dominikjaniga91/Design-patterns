package org.patterns.headfirstdesignpatterns;

class MallardDuck extends Duck implements Flyable, Quackable{

    @Override
    void display() {
        System.out.println("Looks like mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck fly");
    }

    @Override
    public void quack() {
        System.out.println("Quack from mallard duck");
    }
}
