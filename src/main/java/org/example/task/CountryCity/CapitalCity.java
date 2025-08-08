package org.example.task.CountryCity;

import java.util.Objects;

public class CapitalCity extends City {

    private String governmentType;
    private int parliamentNumbers;
    private String mayorName;

    public CapitalCity(int id, String name, long population, boolean isCapital, double area, Country country, String governmentType, int parliamentNumbers, String mayorName) {
        super(id, name, population, isCapital, area, country);
        this.governmentType = governmentType;
        this.parliamentNumbers = parliamentNumbers;
        this.mayorName = mayorName;
    }

    public String getGovernmentType() {
        return governmentType;
    }

    public void setGovernmentType(String governmentType) {
        this.governmentType = governmentType;
    }

    public int getParliamentNumbers() {
        return parliamentNumbers;
    }

    public void setParliamentNumbers(int parliamentNumbers) {
        this.parliamentNumbers = parliamentNumbers;
    }

    public String getMayorName() {
        return mayorName;
    }

    public void setMayorName(String mayorName) {
        this.mayorName = mayorName;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CapitalCity that = (CapitalCity) o;
        return parliamentNumbers == that.parliamentNumbers && Objects.equals(governmentType, that.governmentType) && Objects.equals(mayorName, that.mayorName);
    }

    @Override
    public String toString() {
        return "CapitalCity{" +
                "governmentType='" + governmentType + '\'' +
                ", parliamentNumbers=" + parliamentNumbers +
                ", mayorName='" + mayorName + '\'' +
                '}';
    }
}
