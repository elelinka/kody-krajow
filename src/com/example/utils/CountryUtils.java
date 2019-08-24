package com.example.utils;

import com.example.model.Country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountryUtils {
    public static Map<String, Country> getCountryMap(String path) throws IOException {
        Map<String, Country> countryMap = new HashMap<>();

        BufferedReader file = new BufferedReader(new FileReader(path));
        String line;
        String[] split;
        String id;
        Country country;
        long population;

        while ((line = file.readLine()) != null) {
            split = line.split(";");
            id = split[0];
            population = Long.parseLong(split[2]);
            country = new Country(id, split[1], population);
            countryMap.put(id, country);
        }
        return countryMap;
    }

    public static String getKey(Map<String, Country> countryMap) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        String id = input.nextLine().toUpperCase();
        input.close();

        Set<String> idSet = countryMap.keySet();
        if (idSet.contains(id)) {
            return countryMap.get(id).toString();
        } else {
            return "Nie ma takiego ID.";
        }
    }
}
