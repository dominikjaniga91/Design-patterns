package org.patterns.headfirstdesignpatterns.decorator;

abstract class CondimentDecorator extends Beverage {

    private Beverage beverage;

    public abstract String getDescription();

}
