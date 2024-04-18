package org.patterns.headfirstdesignpatterns.command;

class LightCommandOn implements Command {

    private final Light light;

    LightCommandOn(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
