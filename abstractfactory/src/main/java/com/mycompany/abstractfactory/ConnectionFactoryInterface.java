package com.mycompany.abstractfactory;

/**
 * ConnectionFactoryInterface - предоставляет интерфейс создания семейств взаимосвязанных
 * или взаимозависимых обьектов.
 * 
 * @author Vladimir
 */
public interface ConnectionFactoryInterface {
    public ImapConnection createImapConnection();
    public ImapsConnection createImapsConnection();
}
