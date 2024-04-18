package org.patterns.headfirstdesignpatterns.command;

class LightCommandOff implements Command {

    private final Light light;

    LightCommandOff(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
