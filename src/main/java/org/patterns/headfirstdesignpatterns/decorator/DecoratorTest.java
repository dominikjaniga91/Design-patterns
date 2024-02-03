package org.patterns.headfirstdesignpatterns.decorator;

class DecoratorTest {
    public static void main(String[] args) {
        Beverage beverage = new Soy(new Whip(new DarkRoast()));
        System.out.println(beverage.getDescription());

    }
}
