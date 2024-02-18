package org.patterns.headfirstdesignpatterns.factory.ny;

import org.patterns.headfirstdesignpatterns.factory.Pizza;

import java.util.List;

class
NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(String name, String dough, String sauce, List<String> toppings) {
        super(name, dough, sauce, toppings);
    }
}
