package com.mycompany.composite;

/**
 * Интерфейс, содержащий общие методы для листовых элементов и комбинаций элементов.
 * 
 * @author Vladimir
 */
public abstract class Component {
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public void add(Component c) {
        throw new UnsupportedOperationException();
    }
    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }
    public void repaint() {
        throw new UnsupportedOperationException();
    }
}
