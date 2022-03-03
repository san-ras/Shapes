package com.itacademy.java.oop.basics;

public class Square {

    private double length, width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Square() {
    }

    public void checkSquareDetails () {
        if (length <= 0 || width <= 0) {
            printInvalid();
        } else {
            printParameters();
        }
    }

    public void printInvalid(){
        System.out.println("Square has invalid length or width: " + length + " " + width);
    }

    public void printParameters() {
        double area = width*length;
        double perimeter = 2*width*length;
        System.out.println("Square's area is " + area + " and perimeter is " + width + ", when its width is " + width + " and its length is " + length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
