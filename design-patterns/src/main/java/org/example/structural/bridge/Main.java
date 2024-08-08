package org.example.structural.bridge;

import org.example.structural.bridge.implementation.Device;
import org.example.structural.bridge.abstraction.RemoteControl;
import org.example.structural.bridge.abstraction.BasicRemoteControl;
import org.example.structural.bridge.implementation.Radio;
import org.example.structural.bridge.implementation.Television;

public class Main {
    public static void main(String[] args) {
        Device tv = new Television();
        Device radio = new Radio();

        RemoteControl basicRemote = new BasicRemoteControl(tv);
        basicRemote.turnOn();
        basicRemote.turnOff();

        RemoteControl advancedRemote = new BasicRemoteControl(radio);
        advancedRemote.turnOn();
        advancedRemote.turnOff();
    }

}