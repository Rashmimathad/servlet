package com.xworkz.surveyapp.dto;

import java.io.Serializable;
import java.util.Objects;

public class PropertyDTO implements Serializable,Comparable<String> {
    private String bikeNumber;
    private String carNumber;
    private Integer noOfCycles;
    private Integer shoeSize;
    private Integer noOfShoes;
    private String laptopModel;
    private String tvModel;
    private Integer goldInGms;
    private Integer silverInGms;
    private Double landInAcres;
    private Integer totalSites;
    private String rtcNumber;
    private String buildingOwnerName;
    private Integer noOfCows;

    @Override
    public String toString() {
        return "PropertyDTO{" +
                "bikeNumber='" + bikeNumber + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", noOfCycles=" + noOfCycles +
                ", shoeSize=" + shoeSize +
                ", noOfShoes=" + noOfShoes +
                ", laptopModel='" + laptopModel + '\'' +
                ", tvModel='" + tvModel + '\'' +
                ", goldInGms=" + goldInGms +
                ", silverInGms=" + silverInGms +
                ", landInAcres=" + landInAcres +
                ", totalSites=" + totalSites +
                ", rtcNumber='" + rtcNumber + '\'' +
                ", buildingOwnerName='" + buildingOwnerName + '\'' +
                ", noOfCows=" + noOfCows +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        PropertyDTO that = (PropertyDTO) o;
        return Objects.equals(bikeNumber, that.bikeNumber) && Objects.equals(carNumber, that.carNumber) && Objects.equals(noOfCycles, that.noOfCycles) && Objects.equals(shoeSize, that.shoeSize) && Objects.equals(noOfShoes, that.noOfShoes) && Objects.equals(laptopModel, that.laptopModel) && Objects.equals(tvModel, that.tvModel) && Objects.equals(goldInGms, that.goldInGms) && Objects.equals(silverInGms, that.silverInGms) && Objects.equals(landInAcres, that.landInAcres) && Objects.equals(totalSites, that.totalSites) && Objects.equals(rtcNumber, that.rtcNumber) && Objects.equals(buildingOwnerName, that.buildingOwnerName) && Objects.equals(noOfCows, that.noOfCows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bikeNumber, carNumber, noOfCycles, shoeSize, noOfShoes, laptopModel, tvModel, goldInGms, silverInGms, landInAcres, totalSites, rtcNumber, buildingOwnerName, noOfCows);
    }

    public String getBikeNumber() {
        return bikeNumber;
    }

    public void setBikeNumber(String bikeNumber) {
        this.bikeNumber = bikeNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Integer getNoOfCycles() {
        return noOfCycles;
    }

    public void setNoOfCycles(Integer noOfCycles) {
        this.noOfCycles = noOfCycles;
    }

    public Integer getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(Integer shoeSize) {
        this.shoeSize = shoeSize;
    }

    public Integer getNoOfShoes() {
        return noOfShoes;
    }

    public void setNoOfShoes(Integer noOfShoes) {
        this.noOfShoes = noOfShoes;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public void setLaptopModel(String laptopModel) {
        this.laptopModel = laptopModel;
    }

    public Integer getGoldInGms() {
        return goldInGms;
    }

    public void setGoldInGms(Integer goldInGms) {
        this.goldInGms = goldInGms;
    }

    public String getTvModel() {
        return tvModel;
    }

    public void setTvModel(String tvModel) {
        this.tvModel = tvModel;
    }

    public Double getLandInAcres() {
        return landInAcres;
    }

    public void setLandInAcres(Double landInAcres) {
        this.landInAcres = landInAcres;
    }

    public Integer getSilverInGms() {
        return silverInGms;
    }

    public void setSilverInGms(Integer silverInGms) {
        this.silverInGms = silverInGms;
    }

    public Integer getTotalSites() {
        return totalSites;
    }

    public void setTotalSites(Integer totalSites) {
        this.totalSites = totalSites;
    }

    public String getRtcNumber() {
        return rtcNumber;
    }

    public void setRtcNumber(String rtcNumber) {
        this.rtcNumber = rtcNumber;
    }

    public String getBuildingOwnerName() {
        return buildingOwnerName;
    }

    public void setBuildingOwnerName(String buildingOwnerName) {
        this.buildingOwnerName = buildingOwnerName;
    }

    public Integer getNoOfCows() {
        return noOfCows;
    }

    public void setNoOfCows(Integer noOfCows) {
        this.noOfCows = noOfCows;
    }

    public PropertyDTO(String bikeNumber, String carNumber, Integer noOfCycles, Integer shoeSize, Integer noOfShoes, String laptopModel, Integer goldInGms, String tvModel, Integer silverInGms, Double landInAcres, Integer totalSites, String buildingOwnerName, String rtcNumber, Integer noOfCows) {
        this.bikeNumber = bikeNumber;
        this.carNumber = carNumber;
        this.noOfCycles = noOfCycles;
        this.shoeSize = shoeSize;
        this.noOfShoes = noOfShoes;
        this.laptopModel = laptopModel;
        this.goldInGms = goldInGms;
        this.tvModel = tvModel;
        this.silverInGms = silverInGms;
        this.landInAcres = landInAcres;
        this.totalSites = totalSites;
        this.buildingOwnerName = buildingOwnerName;
        this.rtcNumber = rtcNumber;
        this.noOfCows = noOfCows;
    }

    public PropertyDTO() {
    }

    @Override
    public int compareTo(String o) {
        return this.bikeNumber.compareTo(o);
    }
}
