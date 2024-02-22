package org.behavioral;

public class RandomNumber {
    private double value;

    public RandomNumber() {
        value = Math.random();
    }

    public void changeValue() {
        value = Math.random();
        System.out.println("new value = " + value);
    }

    public void setMemento(Memento m) {
        System.out.println("sto facendo undo...");
        this.value = m.getState();
    }

    public Memento createMemento() {
        System.out.println("creo un memento...");
        return new Memento(value);
    }

    @Override
    public String toString() {
        return "RandomNumber{" +
                "value=" + value +
                '}';
    }
}
