package ru.medovikov.springcourse.springapp1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public PostPunkMusic postPunkMusic(){
        return new PostPunkMusic();
    }

    @Bean
    public List<Music> list() {
        List<Music> lists = new ArrayList<>();
        lists.add(classicalMusic());
        lists.add(rockMusic());
        lists.add(postPunkMusic());

        return lists;
    }

    @Bean
    public MusicalPlayer musicalPlayer(){
        return new MusicalPlayer(list());
    }
}
