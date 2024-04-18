package org.patterns.headfirstdesignpatterns.command;

class GarageDoorCommandOff implements Command {

    private final GarageDoor garageDoor;

    GarageDoorCommandOff(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
        garageDoor.off();
    }

    @Override
    public void undo() {
        garageDoor.on();
    }
}
