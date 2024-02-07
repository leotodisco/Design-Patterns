package org.creational.pneumatico;

public class PneumaticoGara implements IPneumatico {
    private boolean isHard = false;

    @Override
    public String toString() {
        return "PneumaticoGara{" +
                "isHard=" + isHard +
                '}';
    }
}
