package org.creational;

import org.creational.builder.ConcreteCarBuilder;
import org.creational.builder.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteCarBuilder());
        System.out.println(director.buildSportCar());
    }
}