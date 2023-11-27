package com.example;

abstract class RandomNumber {
    public static int getRandomNumber() {
        return (int) ((Math.random() * (3 - 1)) + 1);
    }
}
