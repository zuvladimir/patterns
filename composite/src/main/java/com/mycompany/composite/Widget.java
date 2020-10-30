package com.mycompany.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Виджет, содержит комбинацию элементов
 * 
 * @author Vladimir
 */
public class Widget extends Component {
    private ArrayList<Component> components = new ArrayList<>();
    
    @Override
    public void add(Component c) {
        components.add(c);
    }
    @Override
    public void remove(Component c) {
        components.remove(c);
    }
    /**
     * Рекурсивно перебираем все компоненты в дереве компонентов и отрисовываем каждый отдельно.
     * Таким вот образом выполняются однородные операции на отдельными элементами и над совокупностями элементов.
     */
    @Override
    public void repaint() {
        Iterator<Component> iterator = components.iterator();
        while(iterator.hasNext()) {
            Component c = iterator.next();
            c.repaint();
        }
    }
}
