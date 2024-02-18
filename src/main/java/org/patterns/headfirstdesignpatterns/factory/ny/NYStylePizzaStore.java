package org.patterns.headfirstdesignpatterns.factory.ny;

import org.patterns.headfirstdesignpatterns.factory.Pizza;
import org.patterns.headfirstdesignpatterns.factory.PizzaStore;

import java.util.Collections;

public class NYStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = new Pizza();
        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza("NY Style Sauce and Cheese Pizza",
                    "Thin Crust Dough",
                    "Marinaran Sauce",
                    Collections.singletonList("Grated Reggiano Cheese")
            );
        } else if ("pepperoni".equals(type)) {
            pizza = new NYStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new NYStyleClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
