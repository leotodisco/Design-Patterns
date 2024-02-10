package org.structural.datasource.decorator;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.structural.datasource.FileDataSource;

import java.util.Base64;



@Log
public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(FileDataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String readData() {
        return super.fileDataSource.readData();
    }

    @Override
    public void writeData(String data) {
        super.fileDataSource.writeData(encryptData(data));
    }

    private String encryptData(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

}
