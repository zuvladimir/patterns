package com.mycompany.factorymethod;

/**
 * Интерфейс создания обьекта Product.
 * 
 * @author Vladimir
 */
public abstract class AbstractProductConfigurer {
    
    public Product configure() {
        Product product = createProduct();
        return product;
    }
    
    protected abstract Product createProduct();
}
