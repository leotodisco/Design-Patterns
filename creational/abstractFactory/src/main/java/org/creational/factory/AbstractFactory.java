package org.creational.factory;

import org.creational.motore.IMotore;
import org.creational.pneumatico.IPneumatico;

public interface AbstractFactory {
    IMotore creaMotore();
    IPneumatico creaPneumatico();
}
