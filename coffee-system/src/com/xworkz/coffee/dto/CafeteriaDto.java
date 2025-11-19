package com.xworkz.coffee.dto;

import java.io.Serializable;
import java.util.Objects;

public class CafeteriaDto implements Serializable,Comparable<String> {
    private String name;
    private String location;
    private String type;
    private Double price;
    private String franchiseName;
    private String ownerName;
    private String gstNo;

    public CafeteriaDto() {
    }

    public CafeteriaDto(String name, String location, String type, Double price, String ownerName, String franchiseName, String gstNo) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.price = price;
        this.ownerName = ownerName;
        this.franchiseName = franchiseName;
        this.gstNo = gstNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getFranchiseName() {
        return franchiseName;
    }

    public void setFranchiseName(String franchiseName) {
        this.franchiseName = franchiseName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getGstNo() {
        return gstNo;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }

    @Override
    public String toString() {
        return "CafeteriaDto{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", franchiseName='" + franchiseName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", gstNo='" + gstNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CafeteriaDto that = (CafeteriaDto) o;
        return Objects.equals(name, that.name) && Objects.equals(location, that.location) && Objects.equals(type, that.type) && Objects.equals(price, that.price) && Objects.equals(franchiseName, that.franchiseName) && Objects.equals(ownerName, that.ownerName) && Objects.equals(gstNo, that.gstNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, type, price, franchiseName, ownerName, gstNo);
    }


    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }
}
