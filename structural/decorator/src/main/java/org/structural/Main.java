package org.structural;

import org.structural.datasource.FileDataSource;
import org.structural.datasource.IDataSource;
import org.structural.datasource.decorator.EncryptionDecorator;

public class Main {
    public static void main(String[] args) {
        String filePath = "structural/decorator/src/main/resources/prova.txt";
        var fileDataSource = new FileDataSource(filePath);
        fileDataSource.writeData("sto scrivendo qualcosa non crittografato \n");

        var decoratore = new EncryptionDecorator(fileDataSource);
        decoratore.writeData("questi sono i dati nascosti");


    }
}