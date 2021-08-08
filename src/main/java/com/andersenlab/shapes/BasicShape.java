package com.andersenlab.shapes;

import com.andersenlab.shapes.enums.Color;

public class BasicShape {

    protected Color borderColor;
    protected Color fillColor;

    public BasicShape(Color borderColor, Color fillColor) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public Color getFillColor() {
        return fillColor;
    }
}
