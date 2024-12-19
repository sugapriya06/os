package com.example.dataengineering.transformation;

import java.util.List;
import java.util.stream.Collectors;

public class DataTransformation {
    public List<String[]> filterByCountry(List<String[]> data, String country) {
        return data.stream()
                   .filter(row -> row[2].equalsIgnoreCase(country))
                   .collect(Collectors.toList());
    }
}
