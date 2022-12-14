package com.razin.vadim;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("Bethoven sonata 2");
        songs.add("Mozart sonata 5");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }

}
