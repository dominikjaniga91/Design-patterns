package org.patterns.headfirstdesignpatterns.command;

import java.util.List;

class MacroCommand implements Command {

    private final List<Command> commands;

    MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    @Override
    public void undo() {
        commands.forEach(Command::undo);
    }
}
