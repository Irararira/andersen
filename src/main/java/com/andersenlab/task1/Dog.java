package com.andersenlab.task1;

public class Dog extends Animal {
    private static int dogCount = 0;
    private static final double DOG_MAX_RUN_LENGTH = 500.0;
    private static final double DOG_MAX_SWIM_LENGTH = 10.0;

    public Dog() {
        count++;
        dogCount++;
    }

    public static void printDogCount() {
        System.out.println("Общее колличество собак: " + dogCount);
    }

    public void run(double length) {
        if (length <= DOG_MAX_RUN_LENGTH) {
            System.out.println("Пес пробежал: " + length + " м");
        } else {
            System.out.println("Пес не может пробежать больше 500 м");
        }
    }

    public void swim(double length) {
        if (length <= DOG_MAX_SWIM_LENGTH) {
            System.out.println("Пес проплыл: " + length + " м");
        } else {
            System.out.println("Пес не может проплыть больше 10 м");
        }
    }
}
