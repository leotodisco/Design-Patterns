package org.creational;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import org.creational.builder.ConcreteCarBuilder;
import org.creational.carParts.*;

import java.util.ArrayList;

@Getter
@Setter
@Log
@ToString
public class Car {
    private CarType type;
    private Engine engine;
    private int nSeats;
    private ArrayList<Brake> brakes;
    private Transmission transmission;

    //optional elements
    private boolean leds;
    private boolean appleCarPlay;


    public Car(final ConcreteCarBuilder builder) {
        this.type = builder.getType();
        this.engine = builder.getEngine();
        this.nSeats = builder.getNSeats();
        this.transmission = builder.getTransmission();
        this.brakes = builder.getBrakes();
        this.leds = builder.isLeds();
        this.appleCarPlay = builder.isAppleCarPlay();
    }
}
