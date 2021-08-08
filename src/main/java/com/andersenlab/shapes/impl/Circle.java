package com.andersenlab.shapes.impl;

import com.andersenlab.shapes.BasicShape;
import com.andersenlab.shapes.Shape;
import com.andersenlab.shapes.enums.Color;

public class Circle extends BasicShape implements Shape {
    private double radius;

    public Circle(Color borderColor, Color fillColor, double radius) {
        super(borderColor, fillColor);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
