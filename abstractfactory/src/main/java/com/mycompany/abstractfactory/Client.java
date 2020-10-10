package com.mycompany.abstractfactory;

/**
 * Клиент
 * 
 * @author Vladimir
 */
public class Client {
    private ConnectionFactoryInterface connectionFactory;
    
    public Client(ConnectionFactoryInterface connectionFactory) {
        this.connectionFactory = connectionFactory;
    }
    
    public void imapConnect() {
        connectionFactory.createImapConnection().connect();
    }
    
    public void imapsConnect() {
        connectionFactory.createImapsConnection().connect();
    }
}
