package com.mycompany.observer;

/**
 * Интерфейс для подсчиков
 * 
 * @author Vladimir
 */
public interface Observer {
    public void update(Observable o);
    public void sendNews();
}
