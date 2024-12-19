package com.example.dataengineering.storage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataStorage {
    public void writeCSV(List<String[]> data, String outputPath) {
        try (FileWriter writer = new FileWriter(outputPath)) {
            for (String[] row : data) {
                writer.append(String.join(",", row)).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
