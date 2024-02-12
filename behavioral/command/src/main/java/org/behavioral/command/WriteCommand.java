package org.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import org.behavioral.receiver.Receiver;

import java.io.File;

@AllArgsConstructor
@Getter
@Setter
@Log
@Builder
public class WriteCommand implements ICommand {
    private Receiver receiver;
    private String content;
    private File file;

    @Override
    public void execute() {
        log.info("writing on file...");
        receiver.writeOnFile(file, content);
    }
}
