package org.patterns.headfirstdesignpatterns.command;

import lombok.Getter;

@Getter
class Stereo {

    private final String name;
    private CD cd;
    private DVD dvd;
    private String station;
    private int volume;

    Stereo(String name) {
        this.name = name;
    }

    void on() {
        System.out.println("Stereo on");
    }

    void off() {
        System.out.println("Stereo off");
    }

    void setCD(CD cd) {
        this.cd = cd;
    }

    void setDVD(DVD dvd) {
        this.dvd = dvd;
    }

    void setRadio(String station) {
        this.station = station;
    }

    void setVolume(int volume) {
        this.volume = volume;
    }
}
