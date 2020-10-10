package com.mycompany.factorymethod;

/**
 * Класс, содержащий реализацию фабричного метода, для конфигурирования ProductB.
 * 
 * @author Vladimir
 */
public class ProductBConfigurer extends AbstractProductConfigurer {
    @Override
    protected Product createProduct() {
        Product p = new ProductB();
        p.setName("ProductB");
        p.setPrice(5000);
        p.setDesc("description");
        return p;
    }
    
}
