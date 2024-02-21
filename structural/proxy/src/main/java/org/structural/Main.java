package org.structural;

public class Main {
    public static void main(String[] args) {
        Subject proxy = new ProxySubject();

        proxy.operazione();

        proxy.operazione(); //qui riusa l'oggetto creato precedentemente rendendo l'esecuzione efficiente
    }
}