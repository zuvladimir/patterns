package com.mycompany.adapter;

/**
 * Triangle - адаптируемый обьект треугольника
 * 
 * @author Vladimir
 */
public class Triangle {
    private double a; // одна из сторон треугольника
    private double b;
    private double c;
    private double ha; // высота, опущенная на сторону a
        
    public Triangle(double a, double b, double c, double ha) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ha = ha;
    }
    
    public double getAreaOfTriangle() {
        return 0.5 * a * ha;
    }
    
    public double getPerimeterOfTriangle() {
        return a + b + c;
    }
}
