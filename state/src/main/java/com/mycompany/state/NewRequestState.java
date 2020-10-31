package com.mycompany.state;

/**
 * Состояние, реализующее поведение для новой заявки
 * 
 * @author Vladimir
 */
public class NewRequestState implements State {
    private Request request;
    
    public NewRequestState(Request r) {
        this.request = r;
    }

    @Override
    public void createRequest() {}

    @Override
    public void handleRequest() {
        System.out.println("Request in progress...");
        request.setState(request.getInProgressRequest()); // изменили состояние обьекта заявки
    }

    @Override
    public void closeRequest() {}
    
}
