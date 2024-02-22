package org.creational;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.java.Log;

@Log
@Setter
@Getter
public class LibroHorror extends Libro {
    private final String genere = "Horror";

    public LibroHorror(String titolo, int annoPubblicazione, String autore) {
        super(titolo, annoPubblicazione, autore);
    }

    @SneakyThrows
    @Override
    public LibroHorror copia() {
        return (LibroHorror) this.clone();
    }

    @Override
    public String toString() {
        return "LibroHorror{ " +
                super.toString() + " " +
                "genere='" + genere + '\'' +
                '}';
    }
}
