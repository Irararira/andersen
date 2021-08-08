package com.andersenlab.task1;

public class Cat extends Animal {
    private static int catCount = 0;
    private static final double CAT_MAX_RUN_LENGTH = 200.0;

    public Cat() {
        count++;
        catCount++;
    }

    public static void printCatCount() {
        System.out.println("Общее количество котов:" + catCount);
    }

    public void run(double length) {
        if (length <= CAT_MAX_RUN_LENGTH) {
            System.out.println("Кот пробежал: " + length + " м");
        } else {
            System.out.println("Кот не может пробежать больше 200 м");
        }
    }

    public void swim(double length) {
        System.out.println("Кот не умеет плавать");
    }
}
