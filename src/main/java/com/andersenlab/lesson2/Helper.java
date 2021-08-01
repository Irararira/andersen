package com.andersenlab.lesson2;

import java.time.Year;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Helper {

    public static boolean interval(int x, int y) {
        return x + y >= 10 && x + y <= 20;
    }

    public static void integer(int a) {
        System.out.println(a >= 0 ? "Положительное число" : "Отрицательное число");
    }

    public static boolean isNegative(int z) {
        return z < 0;
    }

    public static void task(String a, int b) {
        for (int c = 0; c < b; c++) {
            System.out.println(a);
        }
    }

    public static boolean leapYear(int year) {
        return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }

    public static void replace(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }

    }

    public static void oneHundred(int[] hundred) {
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] = i + 1;
        }
    }

    public static void multiply() {
        int[] x = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 6) {
                x[i] = x[i] * 2;
            }
        }
    }

    public static void square() {
        int[][] f = new int[10][10];
        for (int i = 0, j = f.length - 1; i < f.length; i++, j--) {
            f[i][i] = 1;
            f[i][j] = 1;
        }
    }

    public static int[] twoArguments(int len, int initialValue) {
        int[] fx = new int[len];
        Arrays.fill(fx, initialValue);
        return fx;
    }

    public static void minMax(int[] array) {
        Arrays.sort(array);
        System.out.println("Min " + array[0]);
        System.out.println("Max " + array[array.length - 1]);
    }

    public static boolean divideArray(int[] array) {
        boolean isDivided = false;

        for (int i = 1; i < array.length; i++) {
            int[] firstHalf = Arrays.copyOfRange(array, 0, i);
            int[] secondHalf = Arrays.copyOfRange(array, i, array.length);
            int firsHalfSum = sum(firstHalf);
            int secondHalfSum = sum(secondHalf);
            if (firsHalfSum == secondHalfSum) {
                isDivided = true;
                break;
            }
        }

        return isDivided;
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void rotateRight(int[] array, int numberOfRotation) {
        for(int i = 0; i < numberOfRotation; i++){
            int j, last;
            //Stores the last element of array
            last = array[array.length-1];

            for(j = array.length-1; j > 0; j--){
                //Shift element of array by one
                array[j] = array[j-1];
            }
            //Last element of array will be added to the start of array.
            array[0] = last;
        }
    }
}
