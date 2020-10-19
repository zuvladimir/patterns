package com.mycompany.command;

/**
 * Инициатор оплаты
 * 
 * @author Vladimir
 */
public class PaymentInvoker {
    private Command[] commands;
    // Команда для отмены
    // ( Для отмены всех предыдущих комманд может потребоваться создать стек команд для отмены Command[], 
    // далеее поочередно их отменять и удалять из стека. )
    private Command undoCommand;
    
    public PaymentInvoker() {
        commands = new Command[3];
    }
    
    public void setCommand(int i, Command c) {
        commands[i] = c;
    }
    
    public void execute (int i) {
        commands[i].execute();
        undoCommand = commands[i];
    }

    // отмена операций, соверешенных последней выполненной командой
    public void undo () {
        undoCommand.undo();
    }
}
