package org.example;

public class FootBall extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start PLaying!");

    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
