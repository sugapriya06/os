
package com.example;

import com.example.dataengineering.ingestion.DataIngestion;
import com.example.dataengineering.transformation.DataTransformation;
import com.example.dataengineering.storage.DataStorage;
import com.example.dataengineering.analytics.DataAnalytics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputFile = "data/input.csv";
        String outputFile = "data/output.csv";

        DataIngestion ingestion = new DataIngestion();
        DataTransformation transformation = new DataTransformation();
        DataStorage storage = new DataStorage();
        DataAnalytics analytics = new DataAnalytics();

        List<String[]> data = ingestion.readCSV(inputFile);
        List<String[]> filteredData = transformation.filterByCountry(data, "USA");

        storage.writeCSV(filteredData, outputFile);

        double avgSalary = analytics.calculateAverageSalary(filteredData);
        System.out.println("Average Salary in the USA: $" + avgSalary);
    }
}

