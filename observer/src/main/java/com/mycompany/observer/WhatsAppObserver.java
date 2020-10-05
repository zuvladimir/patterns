package com.mycompany.observer;

/**
 * WhatsApp наблюдатель
 * 
 * @author Vladimir
 */
public class WhatsAppObserver implements Observer {
    private Observable o;
    
    public WhatsAppObserver(Observable o) {
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
         * отправка в WhatsApp
         */
        String news = ((NewsFeed)o).getNews();
        System.out.println(String.format("Send news by WhatsApp: %s", news));
    }
    
}
