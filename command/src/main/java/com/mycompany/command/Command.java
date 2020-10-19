package com.mycompany.command;

/**
 * Интерфейс команды
 * 
 * @author Vladimir
 */
public interface Command {
    public void execute();
    public void undo();
}
