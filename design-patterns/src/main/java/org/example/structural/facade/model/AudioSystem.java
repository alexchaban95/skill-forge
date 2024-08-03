package org.example.structural.facade.model;

public class AudioSystem {
    public void on() {
        System.out.println("Audio system is on.");
    }

    public void off() {
        System.out.println("Audio system is off.");
    }

    public void setVolume(int level) {
        System.out.println("Audio system volume set to " + level);
    }
}