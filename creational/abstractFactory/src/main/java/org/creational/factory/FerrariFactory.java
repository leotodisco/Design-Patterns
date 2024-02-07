package org.creational.factory;

import org.creational.motore.IMotore;
import org.creational.motore.MotoreGara;
import org.creational.pneumatico.IPneumatico;
import org.creational.pneumatico.PneumaticoGara;

public class FerrariFactory implements AbstractFactory {
    @Override
    public IMotore creaMotore() {
        return new MotoreGara();
    }

    @Override
    public IPneumatico creaPneumatico() {
        return new PneumaticoGara();
    }
}
