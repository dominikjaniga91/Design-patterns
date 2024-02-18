package org.patterns.headfirstdesignpatterns.factory;

import java.util.List;

public class Pizza {

    private String name;
    private String dough;
    private String sauce;
    private List<String> toppings;

    public Pizza(String name, String dough, String sauce, List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public Pizza() {

    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... " + dough);
        System.out.println("Adding sauce... " + sauce);
        System.out.println("Adding toppings: ");
        toppings.forEach(System.out::println);
    }

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
