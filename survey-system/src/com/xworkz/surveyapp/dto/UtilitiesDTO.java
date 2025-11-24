package com.xworkz.surveyapp.dto;

import java.io.Serializable;
import java.util.Objects;

public class UtilitiesDTO implements Serializable,Comparable<String> {
    private String electricityBillNumber;
    private String waterBillNumber;
    private Double taxesPaid;
    private String crop;

    public UtilitiesDTO() {

    }

    @Override
    public String toString() {
        return "UtilitiesDTO{" +
                "electricityBillNumber='" + electricityBillNumber + '\'' +
                ", waterBillNumber='" + waterBillNumber + '\'' +
                ", taxesPaid=" + taxesPaid +
                ", crop='" + crop + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UtilitiesDTO that = (UtilitiesDTO) o;
        return Objects.equals(electricityBillNumber, that.electricityBillNumber) && Objects.equals(waterBillNumber, that.waterBillNumber) && Objects.equals(taxesPaid, that.taxesPaid) && Objects.equals(crop, that.crop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(electricityBillNumber, waterBillNumber, taxesPaid, crop);
    }

    public String getElectricityBillNumber() {
        return electricityBillNumber;
    }

    public void setElectricityBillNumber(String electricityBillNumber) {
        this.electricityBillNumber = electricityBillNumber;
    }

    public String getWaterBillNumber() {
        return waterBillNumber;
    }

    public void setWaterBillNumber(String waterBillNumber) {
        this.waterBillNumber = waterBillNumber;
    }

    public Double getTaxesPaid() {
        return taxesPaid;
    }

    public void setTaxesPaid(Double taxesPaid) {
        this.taxesPaid = taxesPaid;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public UtilitiesDTO(String electricityBillNumber, String crop, Double taxesPaid, String waterBillNumber) {
        this.electricityBillNumber = electricityBillNumber;
        this.crop = crop;
        this.taxesPaid = taxesPaid;
        this.waterBillNumber = waterBillNumber;
    }

    @Override
    public int compareTo(String o) {
        return this.electricityBillNumber.compareTo(o);
    }
}
