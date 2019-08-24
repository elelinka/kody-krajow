package com.example.model;

public class Country {
    private String id;
    private String name;
    private long population;

    public Country(String id, String name, long population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")" + " - liczba ludności: " + population;
    }
}
