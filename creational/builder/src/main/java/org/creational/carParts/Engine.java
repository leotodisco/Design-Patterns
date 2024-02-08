package org.creational.carParts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Engine {
    private Integer horsePower;
    private boolean started;
    private Integer rpm;

}
