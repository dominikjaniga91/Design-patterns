package org.patterns.headfirstdesignpatterns.strategy.duck;

class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quacking");
    }
}
