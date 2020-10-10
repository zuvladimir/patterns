package com.mycompany.abstractfactory;

/**
 * Абстрактная фабрика - предоставляет интерфейс создания семейств взаимосвязанных
 * или взаимозависимых обьектов без указания их конкретных классов.
 * 
 * Сокр. Абстрактная фабрика предоставляет интерфейс для создания семейств взаимосвязанных 
 * обьектов без указания их конкретных классов.
 * 
 * Абстракная фабрика основана на композиции: создание обьектов реализуется в методе, 
 * доступ к которому осуществляется через интерфейс фабрики.
 * 
 * Задача Абстрактной фабрики - создание семейств взаимосвязанных обьектов без зависимости 
 * от их конкретных классов.
 * 
 * @author Vladimir
 */
public class Main {
    public static void main(String... args) {
        // Gmail подключение к почтовому серверу
        ConnectionFactoryInterface gmailConnectionFactory = new GmailConnectionFactory();
        Client client = new Client(gmailConnectionFactory);
        client.imapConnect();
        // Yandex подключение к почтовому серверу
        ConnectionFactoryInterface yandexConnectionFactory = new YandexConnectionFactory();
        client = new Client(yandexConnectionFactory);
        client.imapsConnect();
    }
}
