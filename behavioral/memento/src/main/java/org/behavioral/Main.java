package org.behavioral;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        var states = new Stack<Memento>();

        RandomNumber number = new RandomNumber();

        System.out.println("num = " + number);

        states.push(number.createMemento());

        number.changeValue();
        System.out.println("num aggiornato = " + number);

        number.setMemento(states.pop()); //undo
        System.out.println("undo num = " + number);

    }
}