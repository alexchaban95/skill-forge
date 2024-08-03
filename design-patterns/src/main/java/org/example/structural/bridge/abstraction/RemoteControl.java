package org.example.structural.bridge.abstraction;

import org.example.structural.bridge.implementation.Device;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void turnOn();

    public abstract void turnOff();

}
