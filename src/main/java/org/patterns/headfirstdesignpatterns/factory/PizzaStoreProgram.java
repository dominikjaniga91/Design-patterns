package org.patterns.headfirstdesignpatterns.factory;

import org.patterns.headfirstdesignpatterns.factory.ny.NYStylePizzaStore;

class PizzaStoreProgram {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
