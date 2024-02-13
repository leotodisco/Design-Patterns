package org.creational;

public class Main {
    public static void main(String[] args) {
        CarSingleton singleton = CarSingleton.getInstance("Ferrari", 444);
        CarSingleton newSingleton = CarSingleton.getInstance("Ford", 21);

        System.out.println(newSingleton); // anche se ho inizializzato il tutto con altri valori, lui mi darà sempre la prima istanza creata
    }
}