package org.creational.factory;

import org.creational.motore.IMotore;
import org.creational.motore.MotoreStradale;
import org.creational.pneumatico.IPneumatico;
import org.creational.pneumatico.PneumaticoStradale;

public class FordFactory implements AbstractFactory {
    @Override
    public IMotore creaMotore() {
        return new MotoreStradale();
    }

    @Override
    public IPneumatico creaPneumatico() {
        return new PneumaticoStradale();
    }
}
