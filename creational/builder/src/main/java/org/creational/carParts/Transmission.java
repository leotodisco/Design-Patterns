package org.creational.carParts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Transmission {
    private int numberOfSpeeds;
    private Mode mode;

    public enum Mode {
        AUTOMATIC, MANUAL, F1, SEMI_AUTOMATIC
    }


}


