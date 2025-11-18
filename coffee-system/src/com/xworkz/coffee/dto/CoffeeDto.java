package com.xworkz.coffee.dto;

import java.io.Serializable;
import java.util.Objects;

public class CoffeeDto  implements Serializable,Comparable<String> {
   private String type;
   private Double price;
   private Integer quantity;
    private String farmerName;
    private String location;

    @Override
    public String toString() {
        return "CoffeeDto{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", farmerName='" + farmerName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public CoffeeDto(){

    }
    public CoffeeDto(String type, Double price, String farmerName, Integer quantity, String location) {
        this.type = type;
        this.price = price;
        this.farmerName = farmerName;
        this.quantity = quantity;
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeDto coffeeDto = (CoffeeDto) o;
        return Objects.equals(type, coffeeDto.type) && Objects.equals(price, coffeeDto.price) && Objects.equals(quantity, coffeeDto.quantity) && Objects.equals(farmerName, coffeeDto.farmerName) && Objects.equals(location, coffeeDto.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, quantity, farmerName, location);
    }

    @Override
    public int compareTo(String o) {
        return this.type.compareTo(o);
    }
}
