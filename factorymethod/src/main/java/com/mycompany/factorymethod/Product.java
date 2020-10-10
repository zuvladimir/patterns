package com.mycompany.factorymethod;

/**
 * Принцип ООП "Инверсия зависимостей" - код должен зависить от абстракций, а не от конкретных классов.
 * Product - является абстракцией, инвертирующей зависимости высокоуровневых и низкоуровневых компонентов.
 * Благодаря чему обеспечивается слабая связанность кода и лучшая расширяемость.
 * 
 * @author Vladimir
 */
public abstract class Product {
    private String name;
    private double price;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
}
