package com.example;

import org.springframework.context.annotation.*;

import java.beans.ConstructorProperties;

@Configuration
@ComponentScan("com.example")
@PropertySource("classpath:values.properties")
public class JavaXML {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public Rock rock(){
        return new Rock();
    }
    @Bean
    public Skrip skrip(){
        return new Skrip();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicalMusic(),rock(),skrip());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
