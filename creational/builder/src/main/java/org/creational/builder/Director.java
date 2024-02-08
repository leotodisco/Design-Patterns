package org.creational.builder;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.creational.Car;
import org.creational.CarType;
import org.creational.carParts.Brake;
import org.creational.carParts.Engine;
import org.creational.carParts.Transmission;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Director {
    ConcreteCarBuilder carBuilder;
    public Car buildSUV() {
        return carBuilder.setEngine(new Engine(220, true, 6000))
                .setBrakes((ArrayList<Brake>) List.of(new Brake(Brake.BrakeMode.STEEL),new Brake(Brake.BrakeMode.STEEL),new Brake(Brake.BrakeMode.STEEL),new Brake(Brake.BrakeMode.STEEL) ))
                .setTransmission(new Transmission(6, Transmission.Mode.AUTOMATIC))
                .setType(CarType.SUV)
                .getResult();
    }

    /**
     * Builds a sport car without brakes
     * @return
     */
    public Car buildSportCar() {
        return carBuilder.setEngine(new Engine(620, true, 9000))
                .setTransmission(new Transmission(8, Transmission.Mode.F1))
                .setType(CarType.SPORTS)
                .setLeds(true)
                .setAppleCarPlay(true)
                .getResult();
    }


}


