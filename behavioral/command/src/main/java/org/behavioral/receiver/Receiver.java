package org.behavioral.receiver;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

import java.io.*;

@NoArgsConstructor
@Log
@Getter
@Setter
public class Receiver {

    public void writeOnFile(File file, String data) {
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch(Exception e){
            log.info("error in write on file");
        }
    }


    public void deleteFile(File file) {
        log.info("deleting file " + file.getName());
        file.delete();
    }


}
