package com.mycompany.factorymethod;

/**
 * Класс, содержащий реализацию фабричного метода, для конфигурирования ProductA.
 * 
 * @author Vladimir
 */
public class ProductAConfigurer extends AbstractProductConfigurer {

    @Override
    protected Product createProduct() {
        Product p = new ProductA();
        p.setName("ProductA");
        p.setPrice(1000);
        p.setDesc("description");
        return p;
    }
    
}
