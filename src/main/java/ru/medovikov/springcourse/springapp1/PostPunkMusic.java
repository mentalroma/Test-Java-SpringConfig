package ru.medovikov.springcourse.springapp1;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class PostPunkMusic implements Music{

    @Override
    public String getSong() {
        return "Электрический ток - Увула";
    }
}
