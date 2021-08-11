package com.andersenlab;

import com.andersenlab.lesson05.Utilities;
import com.andersenlab.lesson05.fruits.Apple;
import com.andersenlab.lesson05.fruits.Box;
import com.andersenlab.lesson05.fruits.Orange;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        Box<Apple> box2 = new Box<>();
        box2.lard(box1);
    }

    private static void arraySwap() {
        Integer[] array = {1, 2, 3};

        System.out.println(Arrays.toString(new Utilities<>(array).swap(1, 2)));
    }
}
