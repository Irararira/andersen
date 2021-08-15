package com.andersenlab.lesson06;

import com.andersenlab.lesson06.exception.MyArrayDataException;
import com.andersenlab.lesson06.exception.MyArraySizeException;

public class TwoArray {

    private static final int ARRAY_DIMENSION = 4;

    public static int twoArray(String[][] array) {
        if (array.length != ARRAY_DIMENSION) {
            throw new MyArraySizeException("Размерность массива не соответствует требуемой. " +
                    "Требуемая размерность=" + ARRAY_DIMENSION + ", размерность массива=" + array.length);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != ARRAY_DIMENSION) {
                throw new MyArraySizeException("Размерность массива не соответствует требуемой. " +
                        "Требуемая размерность=" + ARRAY_DIMENSION + ", размерность массива=" + array[i].length);
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }

}
