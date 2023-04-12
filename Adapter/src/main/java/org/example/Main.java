package org.example;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Shape shape = new SquareAdapter(square);
        shape.draw();
    }
}