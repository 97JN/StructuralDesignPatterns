package org.example;

import org.example.color.BlueColor;
import org.example.color.Color;
import org.example.color.GreenColor;
import org.example.shape.Circle;
import org.example.shape.Shape;
import org.example.shape.Square;

public class Main {
    public static void main(String[] args) {
        Color blue = new BlueColor();
        Color green = new GreenColor();

        Shape circle = new Circle(green);
        Shape square = new Square(blue);

        circle.getShape();
        square.getShape();
    }
}