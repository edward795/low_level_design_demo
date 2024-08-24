package org.example;

import org.example.uifactory.MacUiFactory;

public class Main {
    public static void main(String[] args) {
        Application application=new Application(new MacUiFactory());
        application.paint();
    }
}