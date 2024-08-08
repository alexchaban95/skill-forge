package org.example.structural.facade;

import org.example.structural.facade.model.AudioSystem;
import org.example.structural.facade.model.BluRayPlayer;
import org.example.structural.facade.model.Projector;

public class Main {
    public static void main(String[] args) {
        Projector projector = new Projector();
        AudioSystem audioSystem = new AudioSystem();
        BluRayPlayer bluRayPlayer = new BluRayPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, audioSystem, bluRayPlayer);

        homeTheater.watchMovie("The Matrix");
        homeTheater.endMovie();
    }
}
