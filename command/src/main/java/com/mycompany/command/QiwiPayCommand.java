package com.mycompany.command;

/**
 * Команда оплаты через Qiwi
 * 
 * @author Vladimir
 */
public class QiwiPayCommand implements Command {
    private QiwiPayReciever receiver;
    
    public QiwiPayCommand(QiwiPayReciever r) {
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
