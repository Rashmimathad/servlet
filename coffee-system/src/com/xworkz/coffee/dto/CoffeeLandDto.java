package com.xworkz.coffee.dto;

import java.io.Serializable;
import java.util.Objects;

public class CoffeeLandDto implements Serializable,Comparable<Integer> {
    private Double sizeByAcre;
    private Integer totalPlants;
    private Double totalYield;
    private Double expenditure;
    private Double profitMade;
    private Integer fertilizerQuantityUsed;

    public CoffeeLandDto() {
    }

    public CoffeeLandDto(Double sizeByAcre, Integer totalPlants, Double totalYield, Double expenditure, Double profitMade, Integer fertilizerQuantityUsed) {
        this.sizeByAcre = sizeByAcre;
        this.totalPlants = totalPlants;
        this.totalYield = totalYield;
        this.expenditure = expenditure;
        this.profitMade = profitMade;
        this.fertilizerQuantityUsed = fertilizerQuantityUsed;
    }

    public Double getSizeByAcre() {
        return sizeByAcre;
    }

    public void setSizeByAcre(Double sizeByAcre) {
        this.sizeByAcre = sizeByAcre;
    }

    public Integer getTotalPlants() {
        return totalPlants;
    }

    public void setTotalPlants(Integer totalPlants) {
        this.totalPlants = totalPlants;
    }

    public Double getTotalYield() {
        return totalYield;
    }

    public void setTotalYield(Double totalYield) {
        this.totalYield = totalYield;
    }

    public Double getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(Double expenditure) {
        this.expenditure = expenditure;
    }

    public Double getProfitMade() {
        return profitMade;
    }

    public void setProfitMade(Double profitMade) {
        this.profitMade = profitMade;
    }

    public Integer getFertilizerQuantityUsed() {
        return fertilizerQuantityUsed;
    }

    public void setFertilizerQuantityUsed(Integer fertilizerQuantityUsed) {
        this.fertilizerQuantityUsed = fertilizerQuantityUsed;
    }

    @Override
    public String toString() {
        return "CoffeeLandDto{" +
                "sizeByAcre=" + sizeByAcre +
                ", totalPlants=" + totalPlants +
                ", totalYield=" + totalYield +
                ", expenditure=" + expenditure +
                ", profitMade=" + profitMade +
                ", fertilizerQuantityUsed=" + fertilizerQuantityUsed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeLandDto that = (CoffeeLandDto) o;
        return Objects.equals(sizeByAcre, that.sizeByAcre) && Objects.equals(totalPlants, that.totalPlants) && Objects.equals(totalYield, that.totalYield) && Objects.equals(expenditure, that.expenditure) && Objects.equals(profitMade, that.profitMade) && Objects.equals(fertilizerQuantityUsed, that.fertilizerQuantityUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeByAcre, totalPlants, totalYield, expenditure, profitMade, fertilizerQuantityUsed);
    }

    @Override
    public int compareTo(Integer o) {
        return this.totalPlants-o;
    }
}
