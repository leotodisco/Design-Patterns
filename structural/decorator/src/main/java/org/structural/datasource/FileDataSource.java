package org.structural.datasource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

import java.io.*;

@Log
@Getter
@Setter
@AllArgsConstructor
public class FileDataSource implements IDataSource {
    private String filePath;

    @Override
    public String readData() {
        File filePointer = new File(filePath);
        char[] buffer = null;

        try (FileReader f = new FileReader(filePointer)) {
            buffer = new char[(int) filePointer.length()];
            f.read(buffer);
        } catch (Exception e) {
            log.info("Exception in readData");
        }

        assert buffer != null;
        return new String(buffer);
    }

    @Override
    public void writeData(String data) {
        File filePointer = new File(filePath);
        try (OutputStream fos = new FileOutputStream(filePointer)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch(Exception e){
            log.info("Exception in writeData");
        }
    }
}
