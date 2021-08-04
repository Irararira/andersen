package com.andersenlab;

import static com.andersenlab.Position.*;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Anna Samoilenko", "annasam@tut.by",
                "+380931511889", 13715.30, 29, ADMINISTRATOR);
        employees[1] = new Employee("Ivan Danilenko", "ivandanilenko@mail.com",
                "+380633851212", 21600.00, 32, DEVELOPER);
        employees[2] = new Employee("Sveta Shulga", "svetashu@mail.ru",
                "+380665304836", 17300.00, 45, MANAGER);
        employees[3] = new Employee("Sara Petrova", "sarasara@rambler.com",
                "+38050122020", 11583.50, 47, CLEANER);
        employees[4] = new Employee("Kirill Razumenko", "kirikdrum@gmail.com",
                "+380935482030", 16580.20, 27, SALES);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].print();
            }
        }

    }
}
