package com.dimaUKR;

public abstract class ShapeAbstract {
    private final Color color;

    public ShapeAbstract(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double getArea();
}
