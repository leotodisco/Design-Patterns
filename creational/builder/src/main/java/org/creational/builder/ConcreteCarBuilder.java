package org.creational.builder;


import lombok.Getter;
import org.creational.Car;
import org.creational.CarType;
import org.creational.carParts.Brake;
import org.creational.carParts.Engine;
import org.creational.carParts.Transmission;

import java.util.ArrayList;

@Getter
public class ConcreteCarBuilder implements Builder<Car> {
    private CarType type;
    private Engine engine;
    private int nSeats;
    private ArrayList<Brake> brakes;
    private Transmission transmission;

    //optional elements
    private boolean leds;
    private boolean appleCarPlay;

    public ConcreteCarBuilder() {
        this.brakes = new ArrayList<>();
    }

    public ConcreteCarBuilder setType(CarType carType) {
        this.type = carType;
        return this;
    }

    public ConcreteCarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public ConcreteCarBuilder setSeats(int nSeats) {
        this.nSeats = nSeats;
        return this;
    }

    public ConcreteCarBuilder setLeds(boolean leds) {
        this.leds = leds;
        return this;
    }

    public ConcreteCarBuilder setAppleCarPlay(boolean appleCarPlay) {
        this.appleCarPlay = appleCarPlay;
        return this;
    }

    public ConcreteCarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public ConcreteCarBuilder setBrakes(ArrayList<Brake> brakes) {
        this.brakes = brakes;
        return this;
    }

    @Override
    public Car getResult() {
        return new Car(this);
    }
}
