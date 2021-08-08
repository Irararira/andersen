package com.andersenlab.task2;

public class Cat {
    private boolean satiety;
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        this.satiety = p.decreaseFood(appetite);
    }

    public void printSatiety() {
        if (this.satiety) {
            System.out.println("Кот " + this.name + " сыт");
        } else {
            System.out.println("Кот " + this.name + " голоден");
        }
    }

}
