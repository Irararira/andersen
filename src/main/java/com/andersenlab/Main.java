package com.andersenlab;

import com.andersenlab.lesson06.TwoArray;
import com.andersenlab.lesson06.exception.MyArrayDataException;
import com.andersenlab.lesson06.exception.MyArraySizeException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[4][5];

        String[][] array2 = new String[4][4];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = "1";
            }
        }
        array2[1][1] = "Hello";

        String[][] array3 = new String[4][4];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                array3[i][j] = "1";
            }
        }

        try {
//            TwoArray.twoArray(array);
//            TwoArray.twoArray(array2);
            System.out.println("Сумма " + TwoArray.twoArray(array3));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.err.println("Не удалось обработать массив. Ошибка " + ex);
        }
    }
}
