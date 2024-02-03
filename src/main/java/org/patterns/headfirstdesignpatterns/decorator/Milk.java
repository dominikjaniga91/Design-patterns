package org.patterns.headfirstdesignpatterns.decorator;

class Milk extends CondimentDecorator {

    private final Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
