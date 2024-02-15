package ru.medovikov.springcourse.springapp1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;


public class MusicalPlayer {
    List<Music> list;

    public MusicalPlayer(List<Music> list){
        this.list = list;
    }

    public int Random (int size){
        double a = Math.random() * size;
        int randomNumber;
        return randomNumber = (int) a;
    }

    public void playMusic(){
        System.out.println(list.get(Random(3)).getSong());
    }

}
