package org.example.structural.bridge.implementation;

public class Television implements Device {
    private boolean on = false;

    @Override
    public void enable() {
        on = true;
        System.out.println("Television is now ON.");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Television is now OFF.");
    }

    @Override
    public boolean isEnabled() {
        return on;
    }

}