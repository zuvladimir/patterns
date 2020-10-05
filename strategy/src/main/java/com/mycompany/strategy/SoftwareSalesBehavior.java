package com.mycompany.strategy;

/**
 * Продажи ПО 
 * 
 * @author Vladimir
 */
public class SoftwareSalesBehavior implements MakeMoneyBehavior {

    @Override
    public void makeMoney() {
        System.out.println("Making money by software sales");
    }
    
}
