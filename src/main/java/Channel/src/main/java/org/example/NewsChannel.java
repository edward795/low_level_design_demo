package org.example;

import java.util.zip.Checksum;

public class NewsChannel implements Channel {
    private String news;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(Object o) {
        this.setNews((String)news);
    }
}
