package com.mycompany.state;

/**
 * Состояние, реализующее поведение заявки, взятой в работу.
 * 
 * @author Vladimir
 */
public class InProgressRequestState implements State {
    private Request request;
    
    public InProgressRequestState(Request r) {
        this.request = r;
    }
    
    @Override
    public void createRequest() {}

    @Override
    public void handleRequest() {
        // если из контекста будет попытка начать обработку заявки, которая уже обрабатывается, будет 
        // выведено сообщение: Can`t start handling. Request is already in progress...
        System.out.println("Can`t start handling. Request is already in progress...");
    }

    @Override
    public void closeRequest() {
        System.out.println("Request is closed.");
        request.setState(request.getCloseRequest()); // изменили состояние обьекта заявки
    }
    
}
