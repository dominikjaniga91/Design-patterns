package org.patterns.headfirstdesignpatterns.command;

class Light {

    private final String name;

    Light(String name) {
        this.name = name;
    }

    void on() {
        System.out.println("Light on");
    }

    void off() {
        System.out.println("Light off");
    }
}
