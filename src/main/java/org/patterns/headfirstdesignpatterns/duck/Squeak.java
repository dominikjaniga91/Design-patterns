package org.patterns.headfirstdesignpatterns.duck;

class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeaking");
    }
}
