package org.creational.pneumatico;

public class PneumaticoStradale implements IPneumatico {
    boolean isHard = true;

    @Override
    public String toString() {
        return "PneumaticoStradale{" +
                "isHard=" + isHard +
                '}';
    }
}
