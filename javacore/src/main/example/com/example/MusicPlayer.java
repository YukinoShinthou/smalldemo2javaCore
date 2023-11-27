package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
//@Component
@Scope("singleton")
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;
    public List<Music> musicList = new ArrayList<>();

//    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1 ,
                       @Qualifier("rock") Music music2,
                       @Qualifier("skrip") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;

        musicList.add(this.music1);
        musicList.add(this.music2);
        musicList.add(this.music3);

    }


    //    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }



    public String playMusic(String str){
        if(str.equals("Classic")){
            return "Playing song: " + music1.getSong();
        }else if(str.equals("Rock")){
            return "Playing song: " + music2.getSong();
        }else if(str.equals("Skrip")) {
            return "Playing song: " + music3.getSong();
        }else {
            for (Music music: musicList
             ) {
//            System.out.println("Playing song : " + music.getSong());
            musicList.remove(0);
            return "Playing song : " + music.getSong();
        }
        }
        return "";
    }

//    public String playMusic(){
//        for (Music music: musicList
//             ) {
////            System.out.println("Playing song : " + music.getSong());
//            musicList.remove(0);
//            return "Playing song : " + music.getSong();
//
//        }
//        return "";
//    }


}
