package org.patterns.headfirstdesignpatterns.command;

class StereoWithCDCommandOn implements Command {

    private final Stereo stereo;

    StereoWithCDCommandOn(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD(new CD());
        stereo.setVolume(5);
    }

    @Override
    public void undo() {
        stereo.setCD(null);
        stereo.off();
    }
}
