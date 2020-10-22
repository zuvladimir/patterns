package com.mycompany.adapter;

/**
 * Адаптер для класса Square
 * 
 * @author Vladimir
 */
public class SquareAdapter implements FigureTargetInterface {
    private Square s;
    
    public SquareAdapter(Square s) {
        this.s = s;
    }
    
    @Override
    public double getFigureArea() {
        return s.getAreaOfSquare();
    }

    @Override
    public double getFigurePerimeter() {
        return s.getPerimeterOfSquare();
    }
    
}
