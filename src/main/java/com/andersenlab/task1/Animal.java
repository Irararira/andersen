package com.andersenlab.task1;

public abstract class Animal {
    protected static int count = 0;

    public abstract void run(double length);

    public abstract void swim(double length);

    public static void printCount() {
        System.out.println("Общее количество животных " + count);
    }
}
