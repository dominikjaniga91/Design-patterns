package org.patterns.headfirstdesignpatterns.factory.store;

import org.patterns.headfirstdesignpatterns.factory.ingredients.PizzaIngredientFactory;

class ClamPizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Clam Pizza";
    }


    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();
    }
}
