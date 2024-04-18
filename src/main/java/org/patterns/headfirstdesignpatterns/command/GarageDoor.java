package org.patterns.headfirstdesignpatterns.command;

class GarageDoor {

    private final String name;

    GarageDoor(String name) {
        this.name = name;
    }

    void on() {
        System.out.println("Garage door on");
    }

    void off() {
        System.out.println("Garage door off");
    }
}
