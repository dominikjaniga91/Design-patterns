package org.patterns.headfirstdesignpatterns.factory.store;

import org.patterns.headfirstdesignpatterns.factory.ingredients.PizzaIngredientFactory;
import org.patterns.headfirstdesignpatterns.factory.ingredients.chicago.ChicagoIngredientFactory;

class ChicagoStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
        }
        return pizza;
    }
}
