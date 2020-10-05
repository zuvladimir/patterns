package com.mycompany.strategy;

/**
 * Продажа рекламы
 * 
 * @author Vladimir
 */
public class AdvertisingSalesBehavior implements MakeMoneyBehavior {

    @Override
    public void makeMoney() {
        System.out.println("Making money by advertising sales");
    }
    
}
