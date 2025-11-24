package com.xworkz.surveyapp.dto;

import java.io.Serializable;
import java.util.Objects;

public class PersonalDetailsDTO implements Serializable,Comparable<String> {
    private String name;
    private Integer age;
    private String dateOfBirth;
    private Integer height;
    private Double weight;
    private String education;
    private String occupation;
    private String nativePlace;
    private String motherTongue;
    private String caste;
    private String religion;
    private String complexion;
    private String bloodGroup;
    private String isDisabled;
    private String knownDiseases;

    public PersonalDetailsDTO(String name, Integer age, String dateOfBirth, Integer height, Double weight, String education, String occupation, String nativePlace, String motherTongue, String caste, String religion,String complexion, String bloodGroup, String isDisabled, String knownDiseases) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
        this.education = education;
        this.occupation = occupation;
        this.nativePlace = nativePlace;
        this.motherTongue = motherTongue;
        this.caste = caste;
        this.religion = religion;
        this.complexion = complexion;
        this.isDisabled = isDisabled;
        this.bloodGroup = bloodGroup;
        this.knownDiseases = knownDiseases;
    }

    @Override
    public String toString() {
        return "PersonalDetailsDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", education='" + education + '\'' +
                ", occupation='" + occupation + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", motherTongue='" + motherTongue + '\'' +
                ", caste='" + caste + '\'' +
                ", religion='" + religion + '\'' +
                ", complexion='" + complexion + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", isDisabled='" + isDisabled + '\'' +
                ", knownDiseases='" + knownDiseases + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonalDetailsDTO that = (PersonalDetailsDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(height, that.height) && Objects.equals(weight, that.weight) && Objects.equals(education, that.education) && Objects.equals(occupation, that.occupation) && Objects.equals(nativePlace, that.nativePlace) && Objects.equals(motherTongue, that.motherTongue) && Objects.equals(caste, that.caste) && Objects.equals(religion, that.religion) && Objects.equals(complexion, that.complexion) && Objects.equals(bloodGroup, that.bloodGroup) && Objects.equals(isDisabled, that.isDisabled) && Objects.equals(knownDiseases, that.knownDiseases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dateOfBirth, height, weight, education, occupation, nativePlace, motherTongue, caste, religion, complexion, bloodGroup, isDisabled, knownDiseases);
    }

    public PersonalDetailsDTO() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(String isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getKnownDiseases() {
        return knownDiseases;
    }

    public void setKnownDiseases(String knownDiseases) {
        this.knownDiseases = knownDiseases;
    }

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }
}
