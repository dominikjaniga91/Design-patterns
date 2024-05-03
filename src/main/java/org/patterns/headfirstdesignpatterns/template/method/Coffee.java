package org.patterns.headfirstdesignpatterns.template.method;

class Coffee extends Beverage {

    private final CoffeeConfiguration configuration;

    Coffee(CoffeeConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    protected void addCondiments() {
        if (configuration.milk()) {
            System.out.println("Adding milk");
        }
        if (configuration.sugar()) {
            System.out.println("Adding sugar");
        }
    }

    @Override
    protected void brew() {
        System.out.println("Brewing a coffee beans");
    }
}
