package org.example.structural.adapter;

import org.example.structural.adapter.model.AudioPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("avi", "documentary.avi");
        audioPlayer.play("wav", "music.wav");
    }
}
