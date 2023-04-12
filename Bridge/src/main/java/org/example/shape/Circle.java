package org.example.shape;

import org.example.color.Color;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    public void getShape() {
        System.out.println("Drawing circle");
        color.getColor();
    }
}
