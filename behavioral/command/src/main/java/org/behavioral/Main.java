package org.behavioral;


import org.behavioral.command.FileDeleter;
import org.behavioral.command.WriteCommand;
import org.behavioral.receiver.Receiver;

import java.io.File;

/**
 * Client class
 */
public class Main {
    public static void main(String[] args) {
        String path = "behavioral/command/src/main/resources/prova.txt";
        File file = new File(path);
        Receiver receiver = new Receiver();
        WriteCommand writerCommand = new WriteCommand(receiver, "ciao a tutti", file);
        writerCommand.execute();

        FileDeleter deleterCommand = new FileDeleter(receiver, file);
        deleterCommand.execute();

         deleterCommand.undo();
    }
}