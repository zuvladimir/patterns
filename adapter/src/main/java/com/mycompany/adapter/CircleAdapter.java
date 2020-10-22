package com.mycompany.adapter;

/**
 * Адаптра для класса Circle
 * 
 * @author Vladimir
 */
public class CircleAdapter implements FigureTargetInterface {
    private Circle c; // ссылка на адаптируемый обьект
    
    public CircleAdapter(Circle c) {
        this.c = c;
    }
    
    @Override
    public double getFigureArea() {
        return c.getAreaOfCircle();
    }
    
    /**
     * Окружность не поддерживает метод для вычисления периметра, только площадь.
     * 
     * @return 
     */
    @Override
    public double getFigurePerimeter() {
        throw new UnsupportedOperationException("Circle is not supported perimeter.");
    }

}
