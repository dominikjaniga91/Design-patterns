package org.patterns.headfirstdesignpatterns.decorator;

class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast";
    }

    public double cost() {
        return 0.99;
    }
}
