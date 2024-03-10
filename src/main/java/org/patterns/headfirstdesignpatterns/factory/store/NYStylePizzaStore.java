package org.patterns.headfirstdesignpatterns.factory.store;


import org.patterns.headfirstdesignpatterns.factory.ingredients.PizzaIngredientFactory;
import org.patterns.headfirstdesignpatterns.factory.ingredients.newyork.NYPizzaIngredientFactory;

class NYStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            return new CheesePizza(ingredientFactory);
        } else if ("pepperoni".equals(type)) {
            return new PepperoniPizza(ingredientFactory);
        } else if ("clam".equals(type)) {
            return new ClamPizza(ingredientFactory);
        } else if ("veggie".equals(type)) {
            return new VeggiePizza(ingredientFactory);
        }
        return null;
    }
}
