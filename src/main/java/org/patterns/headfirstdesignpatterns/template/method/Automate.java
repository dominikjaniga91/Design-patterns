package org.patterns.headfirstdesignpatterns.template.method;

class Automate {

    public static void main(String[] args) {

        Beverage coffee = new Coffee(new CoffeeConfiguration(true, true));
        coffee.prepare();

        Beverage tea = new Tea();
        tea.prepare();
    }
}
