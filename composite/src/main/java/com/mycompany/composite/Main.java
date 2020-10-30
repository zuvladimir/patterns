package com.mycompany.composite;

/**
 * Компоновщик - обьединяет обьекты в древовидные структуры для представления
 * иерархий "часть/целое". Компоновщик позволяет клиенту выполнять однородные операции
 * с отдельными обьектами и их совокупностями.
 * 
 * В такой структуре одни и те же операции могут применяться и к комбинациям, и к отдельным обьектам.
 * Иначе говоря, во многих случаях различия между комбинациями и отдельными обьектами игнорируются.
 * 
 * @author Vladimir
 */
public class Main {
    public static void main(String... args) {
        // Листовые элементы
        WidgetItem item1 = new WidgetItem("item1");
        WidgetItem item2 = new WidgetItem("item2");
        WidgetItem item3 = new WidgetItem("item3");
        
        // Комбинации элементов
        Widget widget1 = new Widget();
        widget1.add(item1);
        widget1.add(item2);
        Widget widget2 = new Widget();
        widget2.add(widget1);
        widget2.add(item3);
        
        // Пример операции, вызванной для совокупности обьектов.
        widget2.repaint();
    }
}
