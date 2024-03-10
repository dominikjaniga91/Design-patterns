package org.patterns.headfirstdesignpatterns.factory.store;

import org.patterns.headfirstdesignpatterns.factory.ingredients.PizzaIngredientFactory;

class PepperoniPizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;


    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Pepperoni Pizza";
    }

    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();

    }
}
