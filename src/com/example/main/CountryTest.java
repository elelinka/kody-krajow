package com.example.main;

import com.example.model.Country;
import com.example.utils.CountryUtils;

import java.io.IOException;
import java.util.Map;

public class CountryTest {
    public static void main(String[] args) {
        String path = "C:\\Users\\grego\\Desktop\\kody.csv";
        try {
            Map<String, Country> countryMap = CountryUtils.getCountryMap(path);
            System.out.println(CountryUtils.getKey(countryMap));
        } catch (IOException e) {
            System.out.println("Nie odnaleziono pliku.");
        }
    }
}
