package org.example.shape;

import org.example.color.Color;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    public void getShape() {
        System.out.println("Drawing square");
        color.getColor();
    }
}
