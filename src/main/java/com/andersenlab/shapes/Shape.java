package com.andersenlab.shapes;

import com.andersenlab.shapes.enums.Color;

public interface Shape {

    double calculatePerimeter();

    double calculateSquare();

    Color getBorderColor();

    Color getFillColor();
}
