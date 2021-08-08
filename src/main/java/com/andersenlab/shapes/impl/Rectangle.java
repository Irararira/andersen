package com.andersenlab.shapes.impl;

import com.andersenlab.shapes.BasicShape;
import com.andersenlab.shapes.Shape;
import com.andersenlab.shapes.enums.Color;

public class Rectangle extends BasicShape implements Shape {
    private double a;
    private double b;

    public Rectangle(Color borderColor, Color fillColor, double a, double b) {
        super(borderColor, fillColor);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double calculateSquare() {
        return a * b;
    }
}
