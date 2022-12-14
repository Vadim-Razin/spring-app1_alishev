package com.razin.vadim;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan("com.razin.vadim")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public List<Music> genreList(){
        List<Music> genreList = new ArrayList<>();
        {
            genreList.add(classicalMusic());
            genreList.add(rockMusic());
            genreList.add(rapMusic());
        }
        return genreList;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(genreList());
    }

}
