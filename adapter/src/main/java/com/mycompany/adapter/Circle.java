package com.mycompany.adapter;

/**
 * Circle - адаптируемый класс окружности
 * 
 * @author Vladimir
 */
public class Circle {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getAreaOfCircle() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getLengthOfCircle() {
        return 2 * Math.PI * radius;
    }
}
