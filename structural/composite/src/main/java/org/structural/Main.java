package org.structural;

import org.structural.shape.Container;
import org.structural.shape.Component;
import org.structural.shape.Square;
import org.structural.shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Component triange = new Triangle();
        Component square = new Square();

        Container container = new Container();
        container.addShape(triange);
        container.addShape(square);

        Container container2 = new Container();
        container.addShape(triange);
        container.addShape(container2);
        container.draw();
    }
}