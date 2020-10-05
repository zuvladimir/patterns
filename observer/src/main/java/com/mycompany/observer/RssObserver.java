package com.mycompany.observer;

/**
 * RSS наблюдатель
 * 
 * @author Vladimir
 */
public class RssObserver implements Observer {
    private Observable o;
    
    public RssObserver(Observable o) {
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
         * отправка на email
         */
        String news = ((NewsFeed)o).getNews();
        System.out.println(String.format("Send news by RSS: %s", news));
    }
    
}
