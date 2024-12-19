package com.example.dataengineering.analytics;

import java.util.List;

public class DataAnalytics {
    public double calculateAverageSalary(List<String[]> data) {
        return data.stream()
                   .mapToDouble(row -> Double.parseDouble(row[4]))
                   .average()
                   .orElse(0);
    }
}
