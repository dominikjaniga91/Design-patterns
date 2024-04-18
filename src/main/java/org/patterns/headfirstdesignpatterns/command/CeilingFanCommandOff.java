package org.patterns.headfirstdesignpatterns.command;

class CeilingFanCommandOff implements Command {

    private final CeilingFan ceilingFan;

    CeilingFanCommandOff(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }


    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}
