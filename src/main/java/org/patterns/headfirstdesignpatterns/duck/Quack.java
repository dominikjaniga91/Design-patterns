package org.patterns.headfirstdesignpatterns.duck;

class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quacking");
    }
}
