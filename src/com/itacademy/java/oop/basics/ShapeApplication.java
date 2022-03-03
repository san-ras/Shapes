package com.itacademy.java.oop.basics;

public class ShapeApplication {
    public static void main(String[] args) {

        Square square1 = new Square(15, 6.2);
        Square square2 = new Square(0, 13);
        Square square3 = new Square(6, -2);
        Square square4 = new Square(8,4);

        Square[] squares = new Square[]{square1, square2, square3, square4};

        for (Square square : squares) {
            square.checkSquareDetails();
        }

    }
}
