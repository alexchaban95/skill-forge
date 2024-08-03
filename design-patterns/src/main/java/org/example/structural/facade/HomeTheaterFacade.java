package org.example.structural.facade;

import org.example.structural.facade.model.AudioSystem;
import org.example.structural.facade.model.BluRayPlayer;
import org.example.structural.facade.model.Projector;

public class HomeTheaterFacade {
    private Projector projector;
    private AudioSystem audioSystem;
    private BluRayPlayer bluRayPlayer;

    public HomeTheaterFacade(Projector projector, AudioSystem audioSystem, BluRayPlayer bluRayPlayer) {
        this.projector = projector;
        this.audioSystem = audioSystem;
        this.bluRayPlayer = bluRayPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        projector.setInput("BluRay");
        audioSystem.on();
        audioSystem.setVolume(5);
        bluRayPlayer.on();
        bluRayPlayer.play(movie);
        System.out.println("Movie is playing.");
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        bluRayPlayer.off();
        audioSystem.off();
        projector.off();
        System.out.println("Movie theater is off.");
    }

}
