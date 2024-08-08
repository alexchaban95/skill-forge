package org.example.behavioral.command.model;

public class TV {
    private int currentChannel;

    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }

    public void changeChannel(int channel) {
        currentChannel = channel;
        System.out.println("TV channel changed to " + currentChannel);
    }
}
