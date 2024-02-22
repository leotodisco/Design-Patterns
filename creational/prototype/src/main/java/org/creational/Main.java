package org.creational;

public class Main {
    public static void main(String[] args) {
        LibroHorror prototipo1 = new LibroHorror("Non ne conosco", 2009, "Gianni Mucciaccia");
        LibroHorror libroHorrorBello = prototipo1.copia();
        libroHorrorBello.setAnnoPubblicazione(2008);

        System.out.println("Prototipo = " + prototipo1 + "\nLibroVero = " + libroHorrorBello);

    }
}