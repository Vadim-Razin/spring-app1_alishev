package com.razin.vadim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> musicGenres;

    public MusicPlayer(List<Music> genreList) {
        musicGenres = genreList;
    }

    public void playMusic() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        System.out.println(musicGenres.get(randomNumber).getSong());
    }
}