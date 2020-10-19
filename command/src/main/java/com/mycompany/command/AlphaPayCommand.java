package com.mycompany.command;

/**
 * Команда оплаты через Альфабанк
 * 
 * @author Vladimir
 */
public class AlphaPayCommand implements Command {
    private AlphaPayReciever receiver;
    
    public AlphaPayCommand(AlphaPayReciever r) {
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
