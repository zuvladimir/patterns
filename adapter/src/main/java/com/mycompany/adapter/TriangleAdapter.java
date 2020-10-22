package com.mycompany.adapter;

/**
 * Адаптер для класса Triangle
 * 
 * @author Vladimir
 */
public class TriangleAdapter implements FigureTargetInterface {
    private Triangle t;
    
    public TriangleAdapter(Triangle t) {
        this.t = t;
    }
    
    @Override
    public double getFigureArea() {
        return t.getAreaOfTriangle();
    }

    @Override
    public double getFigurePerimeter() {
        return t.getPerimeterOfTriangle();
    }
    
}
