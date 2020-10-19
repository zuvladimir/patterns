package com.mycompany.command;

/**
 * Команда - инкапсулирует запрос в виде обьекта, делая возможной параметризацию 
 * клиентских обьектов с другими запросами, организацию очереди или регистрацию запросов,
 * а также поддержку отмены операций.
 * 
 * Паттерн команда отделяет обьект, выдающий запросы, от обьекта, который умеет эти запросы выполнять.
 * 
 * Обьект команды инкапсулирует получателя с операцией или набором операций.
 * 
 * Команды могут использоваться для реализации систем регистрации команд и поддержки транзакций.
 * 
 * Шаблон Команда может быть полезен в следующих случаях:
 * --
 * 1. Кнопки пользовательского интерфейса и пункты меню
 * 2. Запись макросов
 * 3. Многоуровневая отмена операций (Undo)
 * 4. Пулы потоков
 * 5. Транзакции
 * 
 * @author Vladimir
 */
public class Main {
    public static void main(String... args) {
        // Инициатор запроса. Выполняет запросы оплаты при этом ничего не зная о способе оплаты.
        // Алгоритмы оплаты скрыты в обьектах получателях запроса см. ниже
        PaymentInvoker invoker = new PaymentInvoker();
        
        // Обьекты получатели
        AlphaPayReciever alphaPay = new AlphaPayReciever();
        SberPayReciever sberPay = new SberPayReciever();
        QiwiPayReciever qiwiPay = new QiwiPayReciever();
        
        // Команды для оплаты
        AlphaPayCommand alphaPayCommand = new AlphaPayCommand(alphaPay);
        SberPayCommand sberPayCommand = new SberPayCommand(sberPay);
        QiwiPayCommand qiwiPayCommand = new QiwiPayCommand(qiwiPay);
        
        // Устанавливаем команды в слоты
        invoker.setCommand(0, alphaPayCommand);
        invoker.setCommand(1, sberPayCommand);
        invoker.setCommand(2, qiwiPayCommand);
        
        invoker.execute(0); // Оплата через Альфбанк
        invoker.execute(1); // Оплата через Сбербанк
        invoker.execute(2); // Оплата через Qiwi
    }
}
