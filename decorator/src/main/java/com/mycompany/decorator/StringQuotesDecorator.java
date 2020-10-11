package com.mycompany.decorator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Декоратор строк для добавления ковычек
 * 
 * @author Vladimir
 */
public class StringQuotesDecorator extends ObjectDecorator {
    private Object o;
    
    public StringQuotesDecorator(Object o) {
        this.o = o;
    }

    /**
     * Добавим в toString добавление ковычек
     * 
     * @return 
     */
    @Override
    public String toString() {
        return String.format("\"%s\"", o.toString());
    }
}
