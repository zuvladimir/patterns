package com.mycompany.observer;

/**
 * Viber наблюдатель
 * 
 * @author Vladimir
 */
public class ViberObserver implements Observer {
    private Observable o;
    
    public ViberObserver(Observable o) {
        this.o = o;
        o.addObserver(this);
    }
    
    @Override
    public void update(Observable o) {
        if (o instanceof NewsFeed) {
            String news = ((NewsFeed)o).getNews();
            /**
             * Логика подготовки новости к отправке
             */
            sendNews();
        }
    }

    @Override
    public void sendNews() {
        /**
         * отправка в Viber
         */
        String news = ((NewsFeed)o).getNews();
        System.out.println(String.format("Send news by Viber: %s", news));
    }
    
}
