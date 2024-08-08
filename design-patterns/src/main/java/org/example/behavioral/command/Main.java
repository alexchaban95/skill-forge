package org.example.behavioral.command;

import org.example.behavioral.command.model.*;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command changeChannel = new ChangeChannelCommand(tv, 5);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(changeChannel);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
