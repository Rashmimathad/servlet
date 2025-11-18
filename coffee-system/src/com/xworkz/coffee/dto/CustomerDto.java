package com.xworkz.coffee.dto;

import java.io.Serializable;
import java.util.Objects;

public class CustomerDto implements Serializable,Comparable<String> {
    private String name;
    private Long mobileNo;
    private String coffeeFlavour;
    private Integer quantity;
    private String paymentMode;

    public CustomerDto(String name, Long mobileNo,String coffeeFlavour, Integer quantity,String paymentMode) {
        this.name = name;
        this.paymentMode = paymentMode;
        this.coffeeFlavour = coffeeFlavour;
        this.mobileNo = mobileNo;
        this.quantity = quantity;
    }

    public CustomerDto() {

    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCoffeeFlavour() {
        return coffeeFlavour;
    }

    public void setCoffeeFlavour(String coffeeFlavour) {
        this.coffeeFlavour = coffeeFlavour;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                ", coffeeFlavour='" + coffeeFlavour + '\'' +
                ", quantity=" + quantity +
                ", paymentMode='" + paymentMode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDto that = (CustomerDto) o;
        return Objects.equals(name, that.name) && Objects.equals(mobileNo, that.mobileNo) && Objects.equals(coffeeFlavour, that.coffeeFlavour) && Objects.equals(quantity, that.quantity) && Objects.equals(paymentMode, that.paymentMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobileNo, coffeeFlavour, quantity, paymentMode);
    }

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }
}
