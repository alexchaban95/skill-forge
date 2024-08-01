package org.example.structural.adapter;

import org.example.structural.adapter.model.AdvancedMediaPlayer;
import org.example.structural.adapter.model.AviPlayer;
import org.example.structural.adapter.model.MediaPlayer;
import org.example.structural.adapter.model.Mp4Player;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("avi")) {
            advancedMediaPlayer = new AviPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("avi")) {
            advancedMediaPlayer.playAvi(fileName);
        }
    }
}
