package org.patterns.headfirstdesignpatterns.command;

class NoCommand implements Command {
    @Override
    public void execute() {
        //No action
    }

    @Override
    public void undo() {
        //No action
    }
}
