package com.mycompany.strategy;

/**
 * Компания
 * 
 * @author Vladimir
 */
public class Company {
    // Здесь используется композиция, вместо наследования
    private MakeMoneyBehavior makeMoney;

    // Поведение компании по способам зарабатывания денег. 
    // Способы могут изменяться независимо и применяться к новым компаниям, т.о. 
    // код будет переиспользоваться и не придется изменять существующие реализации поведений.
    public void makeMoney() {
        this.makeMoney.makeMoney();
    }
    
    public MakeMoneyBehavior getMakeMoney() {
        return makeMoney;
    }

    /**
     * Сеттер обеспечивает динамическое изменение поведения
     * 
     * @param makeMoney 
     */
    public void setMakeMoney(MakeMoneyBehavior makeMoney) {
        this.makeMoney = makeMoney;
    }
}
