package com.mycompany.strategy;

/**
 * Фирма по разработке ПО
 *
 * @author Vladimir
 */
public class SoftwareDevelopment extends Company {
    
    public SoftwareDevelopment() {
        setMakeMoney(new SoftwareSalesBehavior());
    }
    
}
