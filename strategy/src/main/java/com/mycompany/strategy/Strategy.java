package com.mycompany.strategy;

/**
 * Паттерн Стратегия - определяет семейство алгоритмов, инкапсулирует каждый из них и 
 * обеспечивает взаимозаменяемость. Используется для реализации различных вариантов 
 * поведений.
 * 
 * @author Vladimir
 */
public class Strategy {
   public static void main(String... args) {
       SoftwareDevelopment sd = new SoftwareDevelopment();
       // поведение по умолчанию
       sd.makeMoney();
       // динамическое изменение поведения
       sd.setMakeMoney(new ConsultationSalesBehavior());
       sd.makeMoney();
       ConsultingAgency ca = new ConsultingAgency();
       ca.makeMoney();
       DigitalAgency da = new DigitalAgency();
       da.makeMoney();
   } 
}
