package com.andersenlab.lesson05.fruits;

public class Orange extends Fruit implements Boxable {
    private static final float WEIGHT = 1.5f;

    @Override
    public double getWeight() {
        return WEIGHT;
    }
}
