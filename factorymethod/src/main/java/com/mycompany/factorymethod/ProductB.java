package com.mycompany.factorymethod;

/**
 *
 * @author Vladimir
 */
public class ProductB extends Product {
    @Override
    public String toString() {
        return getName() + ": " + getDesc() + "; " + getPrice();
    }
}
