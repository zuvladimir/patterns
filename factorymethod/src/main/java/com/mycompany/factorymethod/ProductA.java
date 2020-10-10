package com.mycompany.factorymethod;

/**
 *
 * @author Vladimir
 */
public class ProductA extends Product {
    @Override
    public String toString() {
        return getName() + ": " + getDesc() + "; " + getPrice();
    }
}
