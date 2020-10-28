package com.mycompany.iterator;

/**
 * Итератор - предоставляет механизм последовательного перебора элементов коллекции
 * без раскрытия ее внутреннего представления.
 * 
 * Кроме того, перебор элементов выполняется обьектом итератора, а не само коллекцией.
 * Это упрощает итерфейс и реализацию коллекции, а также способствует более логичному 
 * распределению обязаностей.
 * 
 * Принцип одной обязанности: Класс должен иметь только одну причину для изменения.
 * 
 * @author Vladimir
 */
public class Main {
    public static void main(String... args) {
        SiteMenu menu = new SiteMenu();
        printMenu(menu);
    }
    
    public static void printMenu(SiteMenu menu) {
        Iterator menuIterator = menu.createIterator();
        while(menuIterator.hasNext()) {
            MenuItem menuItem = (MenuItem) menuIterator.next();
            System.out.println(menuItem.getName());
        }
    }
}
