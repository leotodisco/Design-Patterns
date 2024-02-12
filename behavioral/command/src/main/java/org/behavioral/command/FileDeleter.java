package org.behavioral.command;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import org.behavioral.receiver.Receiver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Arrays;

@Log
@Getter @Setter
@ToString
public class FileDeleter implements ICommand {
    private Receiver receiver;
    private File file;
    private File backupFile;

    public FileDeleter(Receiver receiver, File file) {
        this.receiver = receiver;
        this.file = file;

        backupFile = null;
    }

    @Override
    public void execute() {
        backup(); //save a backup File
        receiver.deleteFile(file);
    }

    @Override
    public void undo() {
        var buffer = new char[(int) backupFile.length()];

        try(FileReader fileReader = new FileReader(backupFile)) {
            fileReader.read(buffer);
            log.info("file is empty");
        } catch (Exception e){
            e.printStackTrace();
        }

        receiver.writeOnFile(file, String.valueOf(buffer));
        log.info("file restored.");
        backupFile.delete();
    }

    private void backup() {
        String path = "behavioral/command/src/main/resources/prova_backup.txt";
        backupFile = new File(path);
        String daScrivere = "";

        try(FileReader fileReader = new FileReader(file)) {
            var buffer = new char[(int) file.length()];
            fileReader.read(buffer);
            daScrivere = String.valueOf(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }

        receiver.writeOnFile(backupFile, daScrivere);
    }
}
