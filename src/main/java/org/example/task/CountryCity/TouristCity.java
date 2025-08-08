package org.example.task.CountryCity;

import java.util.Objects;

public class TouristCity extends City{

    private int annualVisitors;
    private String mainAttarction;
    private double annualTourismRevenue;

    public TouristCity(int id, String name, long population, boolean isCapital, double area, Country country, int annualVisitors, String mainAttarction, double annualTourismRevenue) {
        super(id, name, population, isCapital, area, country);
        this.annualVisitors = annualVisitors;
        this.mainAttarction = mainAttarction;
        this.annualTourismRevenue = annualTourismRevenue;
    }

    public int getAnnualVisitors() {
        return annualVisitors;
    }

    public void setAnnualVisitors(int annualVisitors) {
        this.annualVisitors = annualVisitors;
    }

    public String getMainAttarction() {
        return mainAttarction;
    }

    public void setMainAttarction(String mainAttarction) {
        this.mainAttarction = mainAttarction;
    }

    public double getAnnualTourismRevenue() {
        return annualTourismRevenue;
    }

    public void setAnnualTourismRevenue(double annualTourismRevenue) {
        this.annualTourismRevenue = annualTourismRevenue;
    }








    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TouristCity that = (TouristCity) o;
        return annualVisitors == that.annualVisitors && Double.compare(annualTourismRevenue, that.annualTourismRevenue) == 0 && Objects.equals(mainAttarction, that.mainAttarction);
    }

    @Override
    public String toString() {
        return "TouristCity{" +
                "annualVisitors=" + annualVisitors +
                ", mainAttarction='" + mainAttarction + '\'' +
                ", annualTourismRevenue=" + annualTourismRevenue +
                '}';
    }
}
