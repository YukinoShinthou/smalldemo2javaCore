package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
public class Computer {
    Scanner scanner = new Scanner(System.in);
    private MusicPlayer musicPlayer;
    private int id = 1;
    //@Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

//    @Override
//    public String toString() {
//        return "Computer id = " + id + " { " + "\n " + musicPlayer.playMusic() + "\n " + musicPlayer.playMusic() +  "\n" + musicPlayer.playMusic() +"\n" + " } ";
//    }

    @Override
    public String toString() {
        System.out.println("What type of song u are going to listen to? :");
        String str = scanner.next();
        return "Computer id = " + id + " { " + "\n " + musicPlayer.playMusic(str) + " } ";
    }
}
