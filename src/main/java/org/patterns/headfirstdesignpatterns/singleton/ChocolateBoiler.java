package org.patterns.headfirstdesignpatterns.singleton;

class ChocolateBoiler {

    private final static ChocolateBoiler INSTANCE = new ChocolateBoiler();

    private ChocolateBoiler() {
    }

    public static ChocolateBoiler getInstance() {
        return INSTANCE;
    }
}
