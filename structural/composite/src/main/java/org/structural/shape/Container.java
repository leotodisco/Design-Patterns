package org.structural.shape;

import java.util.ArrayList;

/**
 * Composite class
 */
public class Container implements Component {
    private ArrayList<Component> shapes;

    public Container(ArrayList<Component> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void draw() {
        shapes.forEach(Component::draw);
    }

    public Container() {
        this.shapes = new ArrayList<>();
    }



    public void addShape(Component shape) {
        this.shapes.add(shape);
    }

    public void removeShape(Component shape) {
        this.shapes.remove(shape);
    }
}
