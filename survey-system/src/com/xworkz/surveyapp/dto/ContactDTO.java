package com.xworkz.surveyapp.dto;

import java.io.Serializable;
import java.util.Objects;

public class ContactDTO implements Serializable,Comparable<String> {
    private Long mobileNumber;
    private Long aadhaarNumber;
    private String panCardNumber;
    private String voterIdNumber;
    private String passportNumber;
    private String rationCardNumber;

    public ContactDTO() {

    }

    @Override
    public String toString() {
        return "ContactDTO{" +
                "mobileNumber=" + mobileNumber +
                ", aadhaarNumber=" + aadhaarNumber +
                ", panCardNumber='" + panCardNumber + '\'' +
                ", voterIdNumber='" + voterIdNumber + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", rationCardNumber='" + rationCardNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContactDTO that = (ContactDTO) o;
        return Objects.equals(mobileNumber, that.mobileNumber) && Objects.equals(aadhaarNumber, that.aadhaarNumber) && Objects.equals(panCardNumber, that.panCardNumber) && Objects.equals(voterIdNumber, that.voterIdNumber) && Objects.equals(passportNumber, that.passportNumber) && Objects.equals(rationCardNumber, that.rationCardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobileNumber, aadhaarNumber, panCardNumber, voterIdNumber, passportNumber, rationCardNumber);
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(Long aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public void setPanCardNumber(String panCardNumber) {
        this.panCardNumber = panCardNumber;
    }

    public String getVoterIdNumber() {
        return voterIdNumber;
    }

    public void setVoterIdNumber(String voterIdNumber) {
        this.voterIdNumber = voterIdNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getRationCardNumber() {
        return rationCardNumber;
    }

    public void setRationCardNumber(String rationCardNumber) {
        this.rationCardNumber = rationCardNumber;
    }

    public ContactDTO(Long mobileNumber, String panCardNumber, Long aadhaarNumber, String voterIdNumber, String passportNumber, String rationCardNumber) {
        this.mobileNumber = mobileNumber;
        this.panCardNumber = panCardNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.voterIdNumber = voterIdNumber;
        this.passportNumber = passportNumber;
        this.rationCardNumber = rationCardNumber;
    }

    @Override
    public int compareTo(String o) {
        return this.panCardNumber.compareTo(o);
    }
}
