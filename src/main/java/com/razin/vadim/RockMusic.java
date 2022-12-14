package com.razin.vadim;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mary");
        songs.add("We will rock you");
        songs.add("Break stuff");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
