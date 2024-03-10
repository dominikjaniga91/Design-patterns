package org.patterns.headfirstdesignpatterns.factory.store;

import lombok.ToString;
import org.patterns.headfirstdesignpatterns.factory.ingredients.*;

@ToString
abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public Pizza() {

    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking pizza");
    }

    public void cut() {
        System.out.println("Cutting pizza");
    }

    public void box() {
        System.out.println("Boxing pizza");
    }
}
