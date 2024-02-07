package org.creational.motore;

public class MotoreStradale implements IMotore {
    private int horsePower = 98;
    private String nome = "Motore 4 cilindri";

    @Override
    public String toString() {
        return "MotoreStradale{" +
                "horsePower=" + horsePower +
                ", nome='" + nome + '\'' +
                '}';
    }
}
