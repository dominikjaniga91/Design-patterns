package org.patterns.headfirstdesignpatterns.command;

import lombok.Getter;

class CeilingFan {

    private final String location;
    @Getter
    private CeilingFan.Speed speed;

    CeilingFan(String location) {
        this.location = location;
    }

    void on() {
        System.out.println("Ceiling fan on");
    }

    void off() {
        System.out.println("Ceiling fan off");
    }

    void low() {
        speed = Speed.LOW;
    }

    void medium() {
        speed = Speed.MEDIUM;
    }

    void high() {
        speed = Speed.HIGH;
    }

    @Getter
    enum Speed {
        OFF(0),
        LOW(1),
        MEDIUM(2),
        HIGH(3);

        private final int speed;

        Speed(int speed) {
            this.speed = speed;
        }
    }
}
