package com.mycompany.strategy;

/**
 * Консалтинговая фирма
 *
 * @author Vladimir
 */
public class ConsultingAgency extends Company {
    
    public ConsultingAgency() {
        setMakeMoney(new ConsultationSalesBehavior());
    }
    
}
