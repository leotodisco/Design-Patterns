package org.creational.motore;

public class MotoreGara implements IMotore {
    private int horsePower = 540;
    private String nome = "Motore V8 Biturbo";

    @Override
    public String toString() {
        return "MotoreGara{" +
                "horsePower=" + horsePower +
                ", nome='" + nome + '\'' +
                '}';
    }
}
