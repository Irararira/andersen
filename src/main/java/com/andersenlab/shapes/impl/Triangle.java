package com.andersenlab.shapes.impl;

import com.andersenlab.shapes.BasicShape;
import com.andersenlab.shapes.Shape;
import com.andersenlab.shapes.enums.Color;

public class Triangle extends BasicShape implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(Color borderColor, Color fillColor, double a, double b, double c) {
        super(borderColor, fillColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateSquare() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
