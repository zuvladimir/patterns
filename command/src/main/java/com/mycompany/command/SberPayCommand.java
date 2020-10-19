package com.mycompany.command;

/**
 * Команда оплаты через Сбербанк
 * 
 * @author Vladimir
 */
public class SberPayCommand implements Command {
    private SberPayReciever receiver;
    
    public SberPayCommand(SberPayReciever r) {
        this.receiver = r;
    }
    
    @Override
    public void execute() {
        receiver.pay();
    }

    @Override
    public void undo() {
        // здесь может быть реализована логика отмены команды оплаты
        // для этого может потребоваться отслеживать состояние обьекта получателя
    }
    
}
