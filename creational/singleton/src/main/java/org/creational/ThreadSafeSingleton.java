package org.creational;

public class ThreadSafeSingleton {
    private String nome;

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(String nome) {
        this.nome = nome;
    }

    public static ThreadSafeSingleton getInstance(String nome) {
        if(instance != null) {
            return instance;
        }

        synchronized (ThreadSafeSingleton.class) {
            if(instance == null) {
                instance = new ThreadSafeSingleton(nome);
            }
            return instance;
        }
    }
}
