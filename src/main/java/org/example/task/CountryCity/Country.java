package org.example.task.CountryCity;

import java.util.Arrays;
import java.util.Objects;

public class Country {

    private int id;
    private String name;
    private String continent;
    private long population;
    private String code;
    private City[] city = new City[10];
    private int cityCount;

    public Country(int id, String name, String continent, long population, String code) {
        this.id = id;
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.code = code;
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

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City[] getCity() {
        return city;
    }

    public void setCity(City[] city) {
        this.city = city;
    }

    public int getCityCount() {
        return cityCount;
    }

    public void setCityCount(int cityCount) {
        this.cityCount = cityCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return id == country.id && population == country.population && cityCount == country.cityCount && Objects.equals(name, country.name) && Objects.equals(continent, country.continent) && Objects.equals(code, country.code) && Objects.deepEquals(city, country.city);
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                ", code='" + code + '\'' +
                ", city=" + Arrays.toString(city) +
                ", cityCount=" + cityCount +
                '}';
    }
}
