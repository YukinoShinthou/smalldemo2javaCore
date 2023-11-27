package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("classicalMusic")
public class ClassicalMusic extends RandomNumber implements Music{
    @Value("${values.song1}")
    private String song1;
    @Value("${values.song2}")
    private String song2;
    @Value("${values.song3}")
    private String song3;

    @Override
    public String getSong(){
        if(getRandomNumber() == 1) {
            return song1;
        }else if(getRandomNumber() == 2){
            return  song2;
        }else{
            return song3;
        }
    }


//    @Override
//    public String getSong(){
//        return "rapsody";
//    }
}
