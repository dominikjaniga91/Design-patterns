package org.patterns.builder;

class Computer {

    private final HardDrive hardDrive;
    private final RAM ram;
    private final CPU cpu;
    private final GPU gpu;
    private final OperatingSystem operatingSystem;

    private Computer(Builder builder) {
        this.hardDrive = builder.hardDrive;
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.operatingSystem = builder.operatingSystem;
    }

    static Builder builder() {
        return new Builder();
    }

    static class Builder {
        private HardDrive hardDrive;
        private RAM ram;
        private CPU cpu;
        private GPU gpu;
        private OperatingSystem operatingSystem;

        Builder hardDrive(HardDrive hardDrive) {
            this.hardDrive = hardDrive;
            return this;
        }

        Builder ram(RAM ram) {
            this.ram = ram;
            return this;
        }

        Builder cpu(CPU cpu) {
            this.cpu = cpu;
            return this;
        }

        Builder gpu(GPU gpu) {
            this.gpu = gpu;
            return this;
        }

        Builder operatingSystem(OperatingSystem operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        Computer build() {
            return new Computer(this);
        }
    }
}
