package org.creational;

import org.creational.factory.AbstractFactory;
import org.creational.motore.IMotore;
import org.creational.pneumatico.IPneumatico;

public class Automobile {
    private IMotore motore;
    private IPneumatico pneumatico;

    public Automobile(AbstractFactory factory) {
        motore = factory.creaMotore();
        pneumatico = factory.creaPneumatico();
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "motore=" + motore +
                ", pneumatico=" + pneumatico +
                '}';
    }
}
