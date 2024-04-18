package org.patterns.headfirstdesignpatterns.command;

class GarageDoorCommandOn implements Command {

    private final GarageDoor garageDoor;

    GarageDoorCommandOn(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
        garageDoor.on();
    }

    @Override
    public void undo() {
        garageDoor.off();
    }
}
