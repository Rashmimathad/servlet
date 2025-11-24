package com.xworkz.surveyapp.dto;

import java.io.Serializable;
import java.util.Objects;

public class SurveyDTO implements Serializable,Comparable<String> {
    public FamilyDTO getFamilyDTO() {
        return familyDTO;
    }

    public void setFamilyDTO(FamilyDTO familyDTO) {
        this.familyDTO = familyDTO;
    }

    public PersonalDetailsDTO getPersonalDetailsDTO() {
        return personalDetailsDTO;
    }

    public void setPersonalDetailsDTO(PersonalDetailsDTO personalDetailsDTO) {
        this.personalDetailsDTO = personalDetailsDTO;
    }

    public ContactDTO getContactDTO() {
        return contactDTO;
    }

    public void setContactDTO(ContactDTO contactDTO) {
        this.contactDTO = contactDTO;
    }

    public FinanceDTO getFinanceDTO() {
        return financeDTO;
    }

    public void setFinanceDTO(FinanceDTO financeDTO) {
        this.financeDTO = financeDTO;
    }

    public PropertyDTO getPropertyDTO() {
        return propertyDTO;
    }

    public void setPropertyDTO(PropertyDTO propertyDTO) {
        this.propertyDTO = propertyDTO;
    }

    public UtilitiesDTO getUtilitiesDTO() {
        return utilitiesDTO;
    }

    public void setUtilitiesDTO(UtilitiesDTO utilitiesDTO) {
        this.utilitiesDTO = utilitiesDTO;
    }

    public SurveyDTO(PersonalDetailsDTO personalDetailsDTO, FamilyDTO familyDTO, ContactDTO contactDTO, PropertyDTO propertyDTO, FinanceDTO financeDTO, UtilitiesDTO utilitiesDTO) {
        this.personalDetailsDTO = personalDetailsDTO;
        this.familyDTO = familyDTO;
        this.contactDTO = contactDTO;
        this.propertyDTO = propertyDTO;
        this.financeDTO = financeDTO;
        this.utilitiesDTO = utilitiesDTO;
    }

    PersonalDetailsDTO personalDetailsDTO;
    FamilyDTO familyDTO;
    ContactDTO contactDTO;
    PropertyDTO propertyDTO;
    FinanceDTO financeDTO;
    UtilitiesDTO utilitiesDTO;


    public SurveyDTO(){

    }

    @Override
    public String toString() {
        return "SurveyDTO{" +
               "personalDetailsDTO = " +personalDetailsDTO+
                ", familyDTO='" + familyDTO + '\'' +
                ", contactDTO=" + contactDTO +
                ", propertyDTO='" + propertyDTO + '\'' +
                ", financeDTO=" + financeDTO +
                ", utilitiesDTO='" + utilitiesDTO + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SurveyDTO surveyDto = (SurveyDTO) o;
        return  Objects.equals(personalDetailsDTO, surveyDto.personalDetailsDTO) && Objects.equals(familyDTO,surveyDto.familyDTO)&& Objects.equals(contactDTO,surveyDto.contactDTO) && Objects.equals(propertyDTO, surveyDto.propertyDTO) && Objects.equals(financeDTO, surveyDto.financeDTO) && Objects.equals(utilitiesDTO, surveyDto.utilitiesDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalDetailsDTO,familyDTO,contactDTO,propertyDTO,financeDTO,utilitiesDTO);
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
