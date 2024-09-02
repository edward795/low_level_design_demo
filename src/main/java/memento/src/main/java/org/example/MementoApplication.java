package org.example;

public class MementoApplication {
    public static void main(String[] args) {
        Orginator orginator=new Orginator();
        CareTaker careTaker=new CareTaker();

        orginator.setState("State #1");
        orginator.setState("State #2");
        careTaker.add(orginator.saveStateToMemento());

        orginator.setState("State #3");
        careTaker.add(orginator.saveStateToMemento());

        orginator.setState("State #4");
        System.out.println("Current State: "+orginator.getState());

        orginator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved state: "+orginator.getState());

        orginator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state : "+orginator.getState());
    }
}
