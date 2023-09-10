package org.patterns.headfirstdesignpatterns.strategy.duck;

class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeaking");
    }
}
