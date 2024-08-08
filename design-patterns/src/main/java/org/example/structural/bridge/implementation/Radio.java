package org.example.structural.bridge.implementation;

public class Radio implements Device {
    private boolean on = false;

    @Override
    public void enable() {
        on = true;
        System.out.println("Radio is now ON.");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Radio is now OFF.");
    }

    @Override
    public boolean isEnabled() {
        return on;
    }

}
