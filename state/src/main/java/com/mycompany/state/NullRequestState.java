package com.mycompany.state;

/**
 * Состояние при несозданной(пустой) заявке
 * 
 * @author Vladimir
 */
public class NullRequestState implements State {
    private Request request;
    
    public NullRequestState(Request r) {
        this.request = r;
    }
    
    @Override
    public void createRequest() {
        System.out.println("Request is created successfully!");
        request.setState(request.getNewRequest()); // изменили состояние обьекта заявки
    }

    @Override
    public void handleRequest() {}

    @Override
    public void closeRequest() {}
    
}
