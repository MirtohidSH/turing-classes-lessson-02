package org.example.task.CountryCity;

import java.util.Objects;

public class IndustrialCity extends City {

    private int numbersOfFactories;
    private String mainIndustry;
    private double annualProductionVolume;

    public IndustrialCity(int id, String name, long population, boolean isCapital, double area, Country country, int numbersOfFactories, String mainIndustry, double annualProductionVolume) {
        super(id, name, population, isCapital, area, country);
        this.numbersOfFactories = numbersOfFactories;
        this.mainIndustry = mainIndustry;
        this.annualProductionVolume = annualProductionVolume;
    }

    public int getNumbersOfFactories() {
        return numbersOfFactories;
    }

    public void setNumbersOfFactories(int numbersOfFactories) {
        this.numbersOfFactories = numbersOfFactories;
    }

    public String getMainIndustry() {
        return mainIndustry;
    }

    public void setMainIndustry(String mainIndustry) {
        this.mainIndustry = mainIndustry;
    }

    public double getAnnualProductionVolume() {
        return annualProductionVolume;
    }

    public void setAnnualProductionVolume(double annualProductionVolume) {
        this.annualProductionVolume = annualProductionVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IndustrialCity that = (IndustrialCity) o;
        return numbersOfFactories == that.numbersOfFactories && Double.compare(annualProductionVolume, that.annualProductionVolume) == 0 && Objects.equals(mainIndustry, that.mainIndustry);
    }

    @Override
    public String toString() {
        return "IndustrialCity{" +
                "numbersOfFactories=" + numbersOfFactories +
                ", mainIndustry='" + mainIndustry + '\'' +
                ", annualProductionVolume=" + annualProductionVolume +
                '}';
    }
}
