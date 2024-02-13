package org.creational;

/**
 * Implementazione Single Threaded
 */
public class CarSingleton {
    private String nome;
    private Integer horsePower;

    private static CarSingleton instance;

    private CarSingleton(String nome, Integer horsePower) {
        this.nome = nome;
        this.horsePower = horsePower;
    }

    public static CarSingleton getInstance(String nome, Integer horsePower) {
        if(instance == null) {
            instance = new CarSingleton(nome, horsePower);
        }

        return instance;
    }

    @Override
    public String toString() {
        return "CarSingleton{" +
                "nome='" + nome + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
