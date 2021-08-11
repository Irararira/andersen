package com.andersenlab.lesson05.fruits;

public class Apple extends Fruit implements Boxable {
    private static final float WEIGHT = 1.0f;

    @Override
    public double getWeight() {
        return WEIGHT;
    }


}
