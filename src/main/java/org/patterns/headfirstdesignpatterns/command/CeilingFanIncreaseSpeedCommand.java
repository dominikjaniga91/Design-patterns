package org.patterns.headfirstdesignpatterns.command;

class CeilingFanIncreaseSpeedCommand implements Command {

    private final CeilingFan ceilingFan;
    private final CeilingFan.Speed previousSpeed;

    CeilingFanIncreaseSpeedCommand(CeilingFan ceilingFan) {
        this.previousSpeed = ceilingFan.getSpeed();
        this.ceilingFan = ceilingFan;
    }


    @Override
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (previousSpeed) {
            case HIGH -> ceilingFan.high();
            case MEDIUM -> ceilingFan.medium();
            case LOW -> ceilingFan.low();
            case OFF -> ceilingFan.off();
        }
    }
}
