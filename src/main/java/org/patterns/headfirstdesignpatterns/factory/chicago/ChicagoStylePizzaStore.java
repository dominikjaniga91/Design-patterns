package org.patterns.headfirstdesignpatterns.factory.chicago;

import org.patterns.headfirstdesignpatterns.factory.Pizza;
import org.patterns.headfirstdesignpatterns.factory.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = new Pizza();
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new ChicagoStyleClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
