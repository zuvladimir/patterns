package com.mycompany.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Новостная лента
 * 
 * @author Vladimir
 */
public class NewsFeed implements Observable {

    private List<Observer> observers;
    private String news;

    public NewsFeed() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(this);
        }
    }
    
    /**
     * Публикация новости
     * 
     * @param news 
     */
    public void publicNews(String news) {
        setNews(news);
        notifyObservers();
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

}
