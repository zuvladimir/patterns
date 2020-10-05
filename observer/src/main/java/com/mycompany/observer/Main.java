package com.mycompany.observer;

/**
 * Паттерн "Наблюдатель" - определяет отношения между обьектами "один ко многим", 
 * таким образом, что при изменении одного обьекта, происходит автоматическое изменения состояния 
 * всех зависимых объектов.
 * 
 * Принцип отделения переменных аспектов программы от неизменных частей.
 * Использование композиции вместо наследования.
 * 
 * 
 * @author Vladimir
 */
public class Main {
    /**
     * Субьект(Оповещатель) - Новостная лента
     * Подписчики - RSS, Viber, WhatsApp
     */
    public static void main(String... args) {
        Observable newsFeed = new NewsFeed();
        
        // Создание обьекта наблюдателя и подписка на оповещения
        Observer rssObserver = new RssObserver(newsFeed);
        Observer viberObserver = new ViberObserver(newsFeed);
        Observer whatsAppObserver = new WhatsAppObserver(newsFeed);
        
        // Изменение состояния оповещателя новостнйо ленты и обновление состояний связанных обьектов
        ((NewsFeed)newsFeed).publicNews("Any Article 1");
        ((NewsFeed)newsFeed).publicNews("Any Article 2");
        ((NewsFeed)newsFeed).publicNews("Any Article 3");
        
        newsFeed.deleteObserver(viberObserver);
        newsFeed.deleteObserver(whatsAppObserver);
        
        ((NewsFeed)newsFeed).publicNews("Any Article 4");
    }
}
