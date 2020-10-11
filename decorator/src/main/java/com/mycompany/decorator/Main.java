package com.mycompany.decorator;

/**
 * Декоратор - динамически наделяет обьект новыми возможностями и является гибкой
 * альтернативой субклассированию в области расширения функциональности.
 * 
 * Типы декораторов соответствуют типам декорируемых компонентов (соответствие достигается
 * посредством наследования или реализации интерфейса)
 * 
 * Декораторы изменяют поведение компонентов, добавляя новую функциональность до и (или) после (или даже вместо)
 * вызовов методов компонентов.
 * 
 * Компонент может декорироваться любым количеством декораторов.
 * 
 * @author Vladimir
 */
public class Main {
    public static void main(String... args) {
        Object test = "Test String";
        System.out.println(test.toString());
        // Расширим поведение String с помощью декоратора StringDecorator
        test = new StringDecorator(test);
        System.out.println(test.toString());
        test = new StringQuotesDecorator(test);
        //new StringQuotesDecorator(new StringDecorator(test));
        System.out.println(test.toString());
    }
}
