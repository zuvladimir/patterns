package com.mycompany.observer;

/**
 * Интерфейс оповещателя
 * 
 * @author Vladimir
 */
public interface Observable {
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();
}
