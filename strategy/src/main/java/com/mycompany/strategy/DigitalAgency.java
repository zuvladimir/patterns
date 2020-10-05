package com.mycompany.strategy;

/**
 * Агентсво цифровых услуг, реклама, маркетинг.
 *
 * @author Vladimir
 */
public class DigitalAgency extends Company {

    public DigitalAgency() {
        setMakeMoney(new AdvertisingSalesBehavior());
    }
}
