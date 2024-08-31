package org.example;

public class ObserverApplication {
    NewsAgency observable=new NewsAgency();
    NewsChannel observer=new NewsChannel();

    observable.addObserver(observer);
    observable.setNews("news");
    System.out.println(observer.getNews());
}
