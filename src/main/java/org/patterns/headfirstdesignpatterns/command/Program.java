package org.patterns.headfirstdesignpatterns.command;

class Program {
    public static void main(String[] args) {

        SimpleRemoteControl control = SimpleRemoteControl.initializeRemoteControl();
        Light livingRoom = new Light("Living Room");
        Light kitchen = new Light("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living room");

        control.setCommand(0, new LightCommandOn(kitchen), new LightCommandOff(kitchen));
        control.setCommand(1, new LightCommandOn(livingRoom), new LightCommandOff(livingRoom));
        control.setCommand(2, new CeilingFanCommandOn(ceilingFan), new CeilingFanCommandOff(ceilingFan));
        control.setCommand(3, new GarageDoorCommandOn(garageDoor), new GarageDoorCommandOff(garageDoor));
        control.setCommand(4, new StereoWithCDCommandOn(stereo), new StereoWithCDCommandOff(stereo));

        control.onButtonWasPressed(0);
        control.offButtonWasPressed(0);

        control.onButtonWasPressed(1);
        control.offButtonWasPressed(1);

        control.onButtonWasPressed(2);
        control.offButtonWasPressed(2);

        control.onButtonWasPressed(3);
        control.offButtonWasPressed(3);

        control.onButtonWasPressed(4);
        control.offButtonWasPressed(4);

    }
}
