package org.example.structural.facade.model;

public class BluRayPlayer {
    public void on() {
        System.out.println("BluRay player is on.");
    }

    public void off() {
        System.out.println("BluRay player is off.");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}
