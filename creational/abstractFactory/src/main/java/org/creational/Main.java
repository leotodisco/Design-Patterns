package org.creational;

import org.creational.factory.FerrariFactory;
import org.creational.factory.FordFactory;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Automobile auto;
        auto = InizializzaAuto();
        System.out.println(auto);
    }

    /**
     * Questo metodo statico permette di chiamare il giusto factory
     * @return
     */
    private static Automobile InizializzaAuto() {
        Automobile auto;
        System.out.println("Inserisci 0 per Ferrari, altrimenti avrai una Ford");
        Scanner sc = new Scanner(System.in);
        int sceltaAutomobile = Integer.parseInt(sc.next());
        sc.close();
        if (sceltaAutomobile == 0) {
            auto = new Automobile(new FerrariFactory());
        }
        else {
            auto = new Automobile(new FordFactory());
        }
        return auto;
    }
}