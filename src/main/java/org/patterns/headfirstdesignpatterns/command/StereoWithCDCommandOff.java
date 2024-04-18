package org.patterns.headfirstdesignpatterns.command;

class StereoWithCDCommandOff implements Command {

    private static final int DEFAULT = 4;

    private final Stereo stereo;
    private final CD cd;
    private final int volume;

    StereoWithCDCommandOff(Stereo stereo) {
        this.stereo = stereo;
        this.cd = stereo.getCd();
        this.volume = stereo.getVolume();
    }

    @Override
    public void execute() {
        stereo.setVolume(DEFAULT);
        stereo.setCD(null);
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD(cd);
        stereo.setVolume(volume);
    }
}
