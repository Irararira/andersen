package com.andersenlab.lesson07;

import java.util.Arrays;

public class AppData {
    private final String[] headers;
    private final int[][] data;

    public AppData(String[] headers, int[][] data) {
        this.headers = headers;
        this.data = data;
    }

    public String[] getHeaders() {
        return headers;
    }

    public int[][] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "headers=" + Arrays.toString(headers) +
                ", data=" + Arrays.deepToString(data) +
                '}';
    }
}
