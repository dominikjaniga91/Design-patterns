package org.patterns.headfirstdesignpatterns.factory.store;

class PizzaStoreProgram {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        Pizza cheese = nyPizzaStore.orderPizza("cheese");
        System.out.println(cheese);
    }
}
