package com.mycompany.abstractfactory;

/**
 * Фабрика для создания семейства продуктов, реализующая интерфейс ConnectionFactoryInterface.
 * 
 * @author Vladimir
 */
public class YandexConnectionFactory implements ConnectionFactoryInterface {

    @Override
    public ImapConnection createImapConnection() {
        ImapConnection c = new ImapConnection();
        c.setUri("imap://imap.yandex.ru");
        c.setPort(143);
        c.setUsername("test@yandex.ru");
        c.setPassword("123456789");
        return c;
    }

    @Override
    public ImapsConnection createImapsConnection() {
        ImapsConnection c = new ImapsConnection();
        c.setUri("imaps://imap.yandex.ru");
        c.setPort(993);
        c.setUsername("test@yandex.ru");
        c.setPassword("123456789");
        return c;
    }
    
}
