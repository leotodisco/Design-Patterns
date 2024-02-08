package org.creational.carParts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Brake {
    public enum BrakeMode{
        STEEL, CARBOCERAMIC,
    }
    BrakeMode mode;

}
