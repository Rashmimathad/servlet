package com.xworkz.surveyapp.dto;

import java.io.Serializable;
import java.util.Objects;

public class FamilyDTO implements Serializable,Comparable<String> {
    private String fatherName;
    private String motherName;
    private String isMarried;
    private String wifeOrHusbandName;
    private Integer noOfChildren;
    private Integer noOfFamilyMembers;
    private String friendName;
    private String petName;

    @Override
    public String toString() {
        return "FamilyDTO{" +
                "fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", isMarried='" + isMarried + '\'' +
                ", wifeOrHusbandName='" + wifeOrHusbandName + '\'' +
                ", noOfChildren=" + noOfChildren +
                ", noOfFamilyMembers=" + noOfFamilyMembers +
                ", friendName='" + friendName + '\'' +
                ", petName='" + petName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FamilyDTO familyDTO = (FamilyDTO) o;
        return Objects.equals(fatherName, familyDTO.fatherName) && Objects.equals(motherName, familyDTO.motherName) && Objects.equals(isMarried, familyDTO.isMarried) && Objects.equals(wifeOrHusbandName, familyDTO.wifeOrHusbandName) && Objects.equals(noOfChildren, familyDTO.noOfChildren) && Objects.equals(noOfFamilyMembers, familyDTO.noOfFamilyMembers) && Objects.equals(friendName, familyDTO.friendName) && Objects.equals(petName, familyDTO.petName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fatherName, motherName, isMarried, wifeOrHusbandName, noOfChildren, noOfFamilyMembers, friendName, petName);
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(String isMarried) {
        this.isMarried = isMarried;
    }

    public String getWifeOrHusbandName() {
        return wifeOrHusbandName;
    }

    public void setWifeOrHusbandName(String wifeOrHusbandName) {
        this.wifeOrHusbandName = wifeOrHusbandName;
    }

    public Integer getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(Integer noOfChildren) {
        this.noOfChildren = noOfChildren;
    }

    public Integer getNoOfFamilyMembers() {
        return noOfFamilyMembers;
    }

    public void setNoOfFamilyMembers(Integer noOfFamilyMembers) {
        this.noOfFamilyMembers = noOfFamilyMembers;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public FamilyDTO(String fatherName, String isMarried, String motherName, String wifeOrHusbandName, Integer noOfChildren, Integer noOfFamilyMembers, String friendName, String petName) {
        this.fatherName = fatherName;
        this.isMarried = isMarried;
        this.motherName = motherName;
        this.wifeOrHusbandName = wifeOrHusbandName;
        this.noOfChildren = noOfChildren;
        this.noOfFamilyMembers = noOfFamilyMembers;
        this.friendName = friendName;
        this.petName = petName;
    }

    public FamilyDTO() {
    }

    @Override
    public int compareTo(String o) {
        return this.fatherName.compareTo(o);
    }
}
