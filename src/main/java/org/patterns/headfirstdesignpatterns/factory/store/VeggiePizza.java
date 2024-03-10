package org.patterns.headfirstdesignpatterns.factory.store;

import org.patterns.headfirstdesignpatterns.factory.ingredients.PizzaIngredientFactory;

class VeggiePizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Veggie Pizza";
    }

    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
