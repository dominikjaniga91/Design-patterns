package org.patterns.headfirstdesignpatterns.command;

class CeilingFan {

    private final String name;

    CeilingFan(String name) {
        this.name = name;
    }

    void on() {
        System.out.println("Ceiling fan on");
    }

    void off() {
        System.out.println("Ceiling fan off");
    }
}
