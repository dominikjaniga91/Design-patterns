package org.patterns.headfirstdesignpatterns.command;

class CeilingFanCommandOn implements Command {

    private final CeilingFan ceilingFan;

    CeilingFanCommandOn(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }


    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
