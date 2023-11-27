package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "ApplicationContext.xml"
//        );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                JavaXML.class
        );

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);
        context.close();

    }
}
