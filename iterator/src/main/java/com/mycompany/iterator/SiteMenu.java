package com.mycompany.iterator;

/**
 * Класс коллекции, элементы которой будут перебираться с помощью итератора.
 * 
 * @author Vladimir
 */
public class SiteMenu {
    private MenuItem[] items = new MenuItem[3];

    public SiteMenu() {
        addItem(new MenuItem("Menu 1"), 0);
        addItem(new MenuItem("Menu 2"), 1);
        addItem(new MenuItem("Menu 3"), 2);
    }
    
    public void addItem(MenuItem item, int i) {
        items[i] = item;
    }
    
    /**
     * Задача перебора коллекции переносится на обьект итератора.
     * Вся остальная логика внутри класса коллекции скрыта от клиентского кода.
     * 
     * @return 
     */
    public Iterator createIterator() {
        return new MenuItemIterator(items);
    }
}
