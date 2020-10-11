package com.mycompany.decorator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Декоратор для всех обьектов String
 * 
 * @author Vladimir
 */
public class StringDecorator extends ObjectDecorator {
    private Object o;
    
    public StringDecorator(Object o) {
        this.o = o;
    }

    /**
     * Добавим в toString вывод текущего времени
     * 
     * @return 
     */
    @Override
    public String toString() {
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        return String.format("%s, time: %s", o.toString(), format.format(new Date()));
    }

}
