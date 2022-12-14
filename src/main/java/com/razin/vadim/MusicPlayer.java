package com.razin.vadim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(
            @Qualifier("classicalMusic") Music classicalMusic,
            @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenres genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (genre == MusicGenres.ROCK) {
            System.out.println("Playing: " + rockMusic.getSongs().get(randomNumber));
        } else if (genre == MusicGenres.CLASSICAL) {
            System.out.println("Playing: " + classicalMusic.getSongs().get(randomNumber));
        }
        else System.out.println("Wrong genre");
    }
}
