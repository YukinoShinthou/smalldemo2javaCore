package com.example;

import org.springframework.stereotype.Component;

//@Component
public class Skrip extends RandomNumber implements Music{
    @Override
    public String getSong(){
        if(getRandomNumber() == 1) {
            return "skrip some 1";
        }else if(getRandomNumber() == 2){
            return  "skrip some 2";
        }else{
            return "skrip some 3";
        }
    }

//    @Override
//    public String getSong(){
//        return "Skri skrip";
//    }
}
