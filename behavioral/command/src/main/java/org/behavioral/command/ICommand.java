package org.behavioral.command;


public interface ICommand {
    public void execute();

    public default void undo() {
        return;
    };
}
