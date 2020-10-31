package com.mycompany.state;

/**
 * Заявка, которая изменяет поведение в зависимости от состояния
 *
 * @author Vladimir
 */
public class Request {

    // классы всех возможных состояний
    private State newRequest;
    private State inProgressRequest;
    private State closeRequest;
    // текущее состояние
    private State state;

    public Request() {
        newRequest = new NewRequestState(this);
        inProgressRequest = new InProgressRequestState(this);
        closeRequest = new CloseRequestState(this);
        state = new NullRequestState(this);
    }

    public void createRequest() {
        state.createRequest(); // делегирование операций текущему классу состояния
    }

    public void handleRequest() {
        state.handleRequest(); // делегирование операций текущему классу состояния
    }

    public void closeRequest() {
        state.closeRequest(); // делегирование операций текущему классу состояния
    }

    public State getNewRequest() {
        return newRequest;
    }

    public State getInProgressRequest() {
        return inProgressRequest;
    }

    public State getCloseRequest() {
        return closeRequest;
    }

    public void setState(State s) {
        this.state = s;
    }

    public State getState() {
        return state;
    }
}
