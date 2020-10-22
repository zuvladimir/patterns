package com.mycompany.adapter;

/**
 * Square - адаптируемый обьект квадрата
 * 
 * @author Vladimir
 */
public class Square {
    private double sideLength;
    
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    
    public double getAreaOfSquare() {
        return sideLength * sideLength;
    }

    public double getPerimeterOfSquare() {
        return 4 * sideLength;
    }
}
