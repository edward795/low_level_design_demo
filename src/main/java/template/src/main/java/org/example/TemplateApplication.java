package org.example;

public class TemplateApplication {
    public static void main(String[] args) {
        Game game=new Cricket();
        game.play();
        System.out.println();
        game=new FootBall();
        game.play();
    }
}
