package com.andersenlab.lesson05;

public class Utilities<T> {

    private T[] array;

    public Utilities(T[] array) {
        this.array = array;
    }

    public T[] swap(int i, int j) {
        if (i < 0 || i >= array.length) {
            return null;
        }
        if (j < 0 || j >= array.length) {
            return null;
        }
        if (i == j) {
            return array;
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

}
