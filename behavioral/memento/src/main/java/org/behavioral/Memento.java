package org.behavioral;

public class Memento {
    private double value;

    public Memento(double value) {
        this.value = value;
    }

    public void setState(final double value) {
        System.out.println("setState...");
        this.value = value;
    }

    public double getState() {
        return this.value;
    }
}
