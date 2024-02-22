package org.creational;

import lombok.*;

@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Libro implements Cloneable {
    private String titolo;
    private int annoPubblicazione;
    private String autore;

    public abstract <T> T copia();
}
