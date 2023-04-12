package org.example;

public class SquareAdapter implements Shape{

    Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public void draw() {
        square.show();
    }
}
