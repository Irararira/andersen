package com.andersenlab;

import com.andersenlab.lesson07.AppData;
import com.andersenlab.lesson07.FileCSV;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = Main.class.getResource("/data.csv").getPath();
        AppData data = FileCSV.readCSV(new File(path));

        System.out.println(data);

        FileCSV.writeCSV(data, new File("src/main/resources/data2.csv"));
    }
}
