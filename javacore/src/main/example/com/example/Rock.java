package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Rock extends  RandomNumber implements Music {

    @Override
    public String getSong(){
        if(getRandomNumber() == 1) {
            return "Rock some 1";
        }else if(getRandomNumber() == 2){
            return  "rock some 2";
        }else{
            return "rock some 3";
        }
    }
}
