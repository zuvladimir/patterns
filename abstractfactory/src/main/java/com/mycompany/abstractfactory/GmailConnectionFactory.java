package com.mycompany.abstractfactory;

/**
 * Фабрика для создания семейства продуктов, реализующая интерфейс ConnectionFactoryInterface.
 * 
 * @author Vladimir
 */
public class GmailConnectionFactory implements ConnectionFactoryInterface {

    @Override
    public ImapConnection createImapConnection() {
        ImapConnection c = new ImapConnection();
        c.setUri("imap://imap.gmail.com");
        c.setPort(143);
        c.setUsername("test@gmail.com");
        c.setPassword("123456789");
        return c;
    }

    @Override
    public ImapsConnection createImapsConnection() {
        ImapsConnection c = new ImapsConnection();
        c.setUri("imaps://imap.gmail.com");
        c.setPort(993);
        c.setUsername("test@gmail.com");
        c.setPassword("123456789");
        return c;
    }
    
}
