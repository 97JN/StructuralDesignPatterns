package org.example.shape;

import org.example.color.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

      public abstract void getShape();
}
