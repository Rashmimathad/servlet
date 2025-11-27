package com.xworkz.matrimonyapp.dto;

import java.io.Serializable;
import java.util.Objects;

public class MatrimonyDto implements Serializable,Comparable<String> {
    private String email;
    private String createProfileFor;
    private String gender;
    private String dateOfBirth;
    private String motherTongue;
    private String religion;
    private String maritalStatus;
    private int height;

    public MatrimonyDto() {

    }

    @Override
    public String toString() {
        return "MatrimonyDto{" +
                "email='" + email + '\'' +
                ", createProfileFor='" + createProfileFor + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", motherTongue='" + motherTongue + '\'' +
                ", religion='" + religion + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MatrimonyDto that = (MatrimonyDto) o;
        return Double.compare(height, that.height) == 0 && Objects.equals(email, that.email) && Objects.equals(createProfileFor, that.createProfileFor) && Objects.equals(gender, that.gender) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(motherTongue, that.motherTongue) && Objects.equals(religion, that.religion) && Objects.equals(maritalStatus, that.maritalStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, createProfileFor, gender, dateOfBirth, motherTongue, religion, maritalStatus, height);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateProfileFor() {
        return createProfileFor;
    }

    public void setCreateProfileFor(String createProfileFor) {
        this.createProfileFor = createProfileFor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public MatrimonyDto(String email, String createProfileFor, String gender, String dateOfBirth, String religion, String motherTongue, String maritalStatus, int height) {
        this.email = email;
        this.createProfileFor = createProfileFor;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.religion = religion;
        this.motherTongue = motherTongue;
        this.maritalStatus = maritalStatus;
        this.height = height;
    }

    @Override
    public int compareTo(String o) {
        return this.gender.compareTo(o);
    }
}
