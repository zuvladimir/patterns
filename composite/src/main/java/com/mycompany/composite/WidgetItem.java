package com.mycompany.composite;

/**
 * Элемент виджета, является листовым элементом. Не поддерживает методы add и remove, 
 * поэтому используются их реализации по-умолчанию.
 * 
 * @author Vladimir
 */
public class WidgetItem extends Component {
    private String name;
    
    public WidgetItem(String name) {
        this.name = name;
    }
    
    /**
     * Отрисовка элемента виджета
     */
    @Override
    public void repaint() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return name;
    }
    
}
