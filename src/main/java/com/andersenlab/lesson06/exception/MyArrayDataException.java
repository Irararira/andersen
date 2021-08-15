package com.andersenlab.lesson06.exception;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j, String value) {
        super("Не удалось преобразовать элемент массива [" + i + "][" + j + "] со значением=" + value);
    }
}
