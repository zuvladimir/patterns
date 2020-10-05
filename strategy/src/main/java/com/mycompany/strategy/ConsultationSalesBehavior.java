package com.mycompany.strategy;

/**
 * Продажи консультаций
 * 
 * @author Vladimir
 */
public class ConsultationSalesBehavior implements MakeMoneyBehavior {

    @Override
    public void makeMoney() {
        System.out.println("Making money by consultation sales");
    }
    
}
