package com.mycompany.state;

/**
 * Общий интерфейс состояний
 * 
 * @author Vladimir
 */
public interface State {
    public void createRequest();
    public void handleRequest();
    public void closeRequest();
}
