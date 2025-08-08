package org.example.task.CountryCity;

import java.util.Arrays;
import java.util.Objects;

public class City {

    private int id;
    private String name;
    private long population;
    private boolean isCapital;
    private double area;
    private Country country;

    public City(int id, String name, long population, boolean isCapital, double area, Country country) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.isCapital = isCapital;
        this.area = area;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }





    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return id == city.id && population == city.population && isCapital == city.isCapital && Double.compare(area, city.area) == 0 && Objects.equals(name, city.name) && Objects.deepEquals(country, city.country);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", isCapital=" + isCapital +
                ", area=" + area +
                ", country=" + Arrays.toString(new Country[]{country}) +
                '}';
    }
}
