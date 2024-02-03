package org.patterns.headfirstdesignpatterns.decorator;

class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House blend";
    }

    public double cost() {
        return 0.89;
    }
}
