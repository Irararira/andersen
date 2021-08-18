package com.andersenlab.lesson07;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FileCSV {

    private static final String[] HEADERS = {"Value1", "Value2", "Value3"};

    public static AppData readCSV(File pathToFile) throws IOException {
        Reader fileReader = new FileReader(pathToFile);
        CSVParser parser = CSVFormat.newFormat(';')
                .withHeader(HEADERS)
                .withFirstRecordAsHeader()
                .parse(fileReader);
        List<CSVRecord> records = parser.getRecords();
        int recordNumber = (int) parser.getRecordNumber();
        int[][] data = new int[recordNumber][HEADERS.length];
        for (int i = 0; i < recordNumber; i++) {
            CSVRecord record = records.get(i);
            for (int j = 0; j < HEADERS.length; j++) {
                data[i][j] = Integer.parseInt(record.get(HEADERS[j]));
            }
        }
        fileReader.close();
        return new AppData(HEADERS, data);
    }

    public static void writeCSV(AppData data, File savingToFile) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(savingToFile)));

        pw.println(String.join(";", data.getHeaders()));

        for (int i = 0; i < data.getData().length; i++) {
            String line = Arrays.stream(data.getData()[i])
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(";"));
            pw.println(line);
        }

        pw.close();
    }


}
