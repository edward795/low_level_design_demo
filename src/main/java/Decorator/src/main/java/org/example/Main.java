package org.example;

public class Main {
    public static void main(String[] args) {
        Pizza pizza=new JalepinoDecorator(new CheeseBurstDecorator(new BazePizza()));
        System.out.println(pizza.bake());
    }
}