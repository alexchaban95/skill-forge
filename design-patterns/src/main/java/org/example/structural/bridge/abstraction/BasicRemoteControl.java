package org.example.structural.bridge.abstraction;

import org.example.structural.bridge.implementation.Device;

public class BasicRemoteControl extends RemoteControl {
    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.enable();
    }

    @Override
    public void turnOff() {
        device.disable();
    }

}
