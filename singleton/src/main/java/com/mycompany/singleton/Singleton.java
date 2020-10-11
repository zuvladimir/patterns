package com.mycompany.singleton;

/**
 * Одиночка - гарантирует, что класс имеет только один экземпляр и предоставляет
 * глобальную точку доступа к этому экземпляру.
 * 
 * Реализация паттерна Одиночка использует приватный конструктор и статический метод в сочетании 
 * со статической переменной.
 * 
 * Паттерн Одиночка может использоваться в пулах программных потоков, кеше, 
 * диалоговые окна, обьекты ведения журналов и т.п.
 * 
 * @author Vladimir
 */
public class Singleton {
    // счётчик для проверки, что используется один и тот же обьект Singleton.
    private int counter = 0;
    private static Singleton singleton;
    
    public static void main(String... args) {
        Singleton singleton = Singleton.getInstance();
        singleton.increase();
        System.out.println("counter = " + singleton.getCounter()); // 1
        singleton = Singleton.getInstance();
        singleton.increase();
        System.out.println("counter = " + singleton.getCounter()); // 2
    }
    
    /**
     * Закрытый конструктор. 
     * (От сигнлотона не получится создать субклассы, 
     *  т.к. нельзя наследовать класс с закрытым конструктором)
     */
    private Singleton() {
        
    }
    
    /**
     * Создает экземпляр Singleton.
     * synchronized - служит для синхронизации метода, в случае использования многопоточности.
     * 
     * @return 
     */
    public static synchronized Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    
    public void increase() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
    
}
