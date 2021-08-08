package com.andersenlab;

import com.andersenlab.park.Park;
import com.andersenlab.payment.Payment;
import com.andersenlab.shapes.Shape;
import com.andersenlab.shapes.enums.Color;
import com.andersenlab.shapes.impl.Circle;
import com.andersenlab.shapes.impl.Rectangle;
import com.andersenlab.shapes.impl.Triangle;
import com.andersenlab.task1.Cat;
import com.andersenlab.task1.Dog;
import com.andersenlab.task2.Plate;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(Color.BLUE, Color.RED, 4);
        shapes[1] = new Rectangle(Color.GREEN, Color.RED, 1, 2);
        shapes[2] = new Triangle(Color.BLUE, Color.GREEN, 1, 2, 3);

        for (Shape shape : shapes) {
            System.out.println("Периметр " + shape.calculatePerimeter());
            System.out.println("Площадь " + shape.calculateSquare());
            System.out.println("Цвет границы " + shape.getBorderColor());
            System.out.println("Цвет заливки " + shape.getFillColor());
        }
    }

    private static void catInheritance() {
        Cat cat = new Cat();

        cat.run(1);
        cat.swim(1);
        Cat.printCatCount();
        Cat.printCount();

        cat.run(1000);

        Dog dog = new Dog();
        dog.run(1);
        dog.swim(1);

        Dog.printDogCount();
        Dog.printCount();

        dog.run(1000);
        dog.swim(1000);
    }

    private static void feedCats() {
        Plate plate = new Plate(10);
        com.andersenlab.task2.Cat[] allCat = new com.andersenlab.task2.Cat[5];
        for (int i = 0; i < allCat.length; i++) {
            allCat[i] = new com.andersenlab.task2.Cat(String.valueOf(i), i);
            allCat[i].eat(plate);
            allCat[i].printSatiety();
        }
    }

    private static void payment() {
        Payment payment = new Payment(6);
        payment.addItem("Кроссовки", 1200.0, 2);
        payment.addItem("Майка", 500.0, 1);
        payment.addItem("Брюки", 800.0, 3);
        payment.addItem("Пиджак", 2000.0, 1);

        payment.seePayment();

        payment.deleteItem();

        payment.seePayment();
    }

    private static void park() {
        Park park = new Park(5);

        park.addAttraction("Качели", 10, 18, 2);
        park.addAttraction("Карусели", 9, 19, 1);
        park.addAttraction("Батут", 11, 17, 3);
        park.addAttraction("Горки", 12, 14, 4);

        park.parkAttraction();

        park.deleteAttraction();
        park.deleteAttraction();

        park.parkAttraction();
    }
}
