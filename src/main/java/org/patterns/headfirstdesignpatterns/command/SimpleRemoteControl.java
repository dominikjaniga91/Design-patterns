package org.patterns.headfirstdesignpatterns.command;

class SimpleRemoteControl {

    public static final int NUMBER_OF_COMMANDS = 7;
    private final Command[] commandsOn;
    private final Command[] commandsOff;
    private Command undo;

    private SimpleRemoteControl(Command[] commandsOn,
                                Command[] commandsOff,
                                Command undo) {
        this.commandsOn = commandsOn;
        this.commandsOff = commandsOff;
        this.undo = undo;
    }

    static SimpleRemoteControl initializeRemoteControl() {
        Command noActionCommand = new NoCommand();
        Command[] commandsOn = new Command[NUMBER_OF_COMMANDS];
        Command[] commandsOff = new Command[NUMBER_OF_COMMANDS];

        for (int i = 0; i < NUMBER_OF_COMMANDS; i++) {
            commandsOn[i] = noActionCommand;
            commandsOff[i] = noActionCommand;
        }
        return new SimpleRemoteControl(commandsOn, commandsOff, noActionCommand);
    }

    void setCommand(int slot, Command commandOn, Command commandOff) {
        if (slot < NUMBER_OF_COMMANDS) {
            commandsOn[slot] = commandOn;
            commandsOff[slot] = commandOff;
        }
    }

    void onButtonWasPressed(int number) {
        commandsOn[number].execute();
        undo = commandsOn[number];
    }

    void offButtonWasPressed(int number) {
        commandsOff[number].execute();
        undo = commandsOff[number];
    }

    void undo() {
        undo.undo();
    }
}
