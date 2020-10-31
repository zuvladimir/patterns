package com.mycompany.state;

/**
 * Состояние, реализующее поведение закрытой заявки.
 * 
 * @author Vladimir
 */
public class CloseRequestState implements State {
    private Request request;
    
    public CloseRequestState(Request r) {
        this.request = r;
    }
    
    @Override
    public void createRequest() {}

    @Override
    public void handleRequest() {}

    @Override
    public void closeRequest() {}
    
}
