package org.patterns.headfirstdesignpatterns.decorator;

class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf";
    }

    public double cost() {
        return 1.99;
    }
}
