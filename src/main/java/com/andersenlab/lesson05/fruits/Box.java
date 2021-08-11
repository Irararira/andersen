package com.andersenlab.lesson05.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Boxable> {

    private final List<T> fruits = new ArrayList<>();

    public boolean add(T item) {
        return fruits.add(item);
    }

    public float getWeight() {
        float sum = 0.0f;
        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<T> other) {
        return this.getWeight() == other.getWeight();
    }

    private List<T> getAll() {
        return new ArrayList<>(fruits);
    }

    private void addAll(List<T> list) {
        fruits.addAll(list);
    }

    private void clear() {
        fruits.clear();
    }

    public void lard(Box<T> other) {
        addAll(other.getAll());
        other.clear();
    }
}
