package com.andersenlab.task2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void addFood(int food){
        this.food += food;
    }

    public boolean decreaseFood(int n) {
        if (food - n > 0) {
            food -= n;
            return true;
        }
        System.out.println("Недостаточно еды");
        return false;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
