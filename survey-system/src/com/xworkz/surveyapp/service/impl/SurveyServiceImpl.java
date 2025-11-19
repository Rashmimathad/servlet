package com.xworkz.surveyapp.service.impl;

import com.xworkz.surveyapp.dto.SurveyDto;
import com.xworkz.surveyapp.exceptions.DataInvalidException;
import com.xworkz.surveyapp.service.SurveyService;

public class SurveyServiceImpl implements SurveyService {
    @Override
    public void validateAndSave(SurveyDto surveyDto) throws DataInvalidException {

        boolean isInvalid=false;
    if(surveyDto!=null){
    if (surveyDto.getName() == null || surveyDto.getName().length() < 3) {
        isInvalid = true;
    }
   else if (surveyDto.getAge() == 0 || surveyDto.getAge() < 0||surveyDto.getAge()>1000000000) {
        isInvalid = true;
    }

    else if (surveyDto.getDateOfBirth() == null || surveyDto.getDateOfBirth().length() < 3) {
        isInvalid = true;
    }

    else if (surveyDto.getHeight() == 0 || surveyDto.getHeight() < 0||surveyDto.getHeight()>1000000000) {
        isInvalid = true;
    }

    else if (surveyDto.getWeight() == 0.0 || surveyDto.getWeight() < 0.0||surveyDto.getWeight()>1000000000.0) {
        isInvalid = true;
    }
    else if (surveyDto.getEducation() == null || surveyDto.getEducation().length() < 3) {
        isInvalid = true;
    }

    else if (surveyDto.getOccupation() == null || surveyDto.getOccupation().length() < 3) {
        isInvalid = true;
    }

    else if (surveyDto.getNativePlace() == null || surveyDto.getNativePlace().length() < 3) {

        isInvalid = true;
    }
    else if (surveyDto.getMotherTongue() == null || surveyDto.getMotherTongue().length() < 3) {
        isInvalid = true;
    }

    else if (surveyDto.getCaste() == null || surveyDto.getCaste().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getReligion() == null || surveyDto.getReligion().length() < 3) {
        isInvalid = true;
    }

    else if (surveyDto.getBloodGroup() == null || surveyDto.getBloodGroup().length() < 3) {
        isInvalid = true;
    }

    else if (surveyDto.getKnownDiseases() == null || surveyDto.getKnownDiseases().length() < 3) {
        isInvalid = true;
    }

    else if (surveyDto.getFatherName() == null || surveyDto.getFatherName().length() < 3) {
        isInvalid = true;
    }

    else if (surveyDto.getMotherName() == null || surveyDto.getMotherName().length() < 3) {
        isInvalid = true;
    }

    else if (surveyDto.getWifeOrHusbandName() == null || surveyDto.getWifeOrHusbandName().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getNoOfChildren() == 0 || surveyDto.getNoOfChildren() < 0|| surveyDto.getNoOfChildren() >1000000000) {
        isInvalid = true;
    }

    else if (surveyDto.getNoOfFamilyMembers() == 0 || surveyDto.getNoOfFamilyMembers() < 0||surveyDto.getNoOfFamilyMembers() >1000000000) {
        isInvalid = true;
    }

    else if (surveyDto.getFriendName() == null || surveyDto.getFriendName().length() < 3) {
        isInvalid = true;
    }

    else if (surveyDto.getPetName() == null || surveyDto.getPetName().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getMobileNumber() == 0 || surveyDto.getMobileNumber() < 0) {
        isInvalid = true;
    }
    else if (surveyDto.getAadhaarNumber() == 0 || surveyDto.getAadhaarNumber() < 0) {
        isInvalid = true;
    }
    else if (surveyDto.getPanCardNumber() == null || surveyDto.getPanCardNumber().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getVoterIdNumber() == null || surveyDto.getVoterIdNumber().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getPassportNumber() == null || surveyDto.getPassportNumber().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getRationCardNumber() == null || surveyDto.getRationCardNumber().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getBikeNumber() == null || surveyDto.getBikeNumber().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getCarNumber() == null || surveyDto.getCarNumber().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getNoOfCycles() == 0 || surveyDto.getNoOfCycles() < 0||surveyDto.getNoOfCycles()>1000000000) {
        isInvalid = true;
    }
    else if (surveyDto.getShoeSize() == 0 || surveyDto.getShoeSize() < 0||surveyDto.getShoeSize()>1000000000) {
        isInvalid = true;
    }
    else if (surveyDto.getNoOfShoes() == 0 || surveyDto.getNoOfShoes() < 0||surveyDto.getNoOfShoes()>1000000000) {
        isInvalid = true;
    }
    else if (surveyDto.getLaptopModel() == null || surveyDto.getLaptopModel().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getTvModel() == null || surveyDto.getTvModel().length() < 3) {
        isInvalid = true;
    }
    else  if (surveyDto.getGoldInGms() == 0 || surveyDto.getGoldInGms() < 0||surveyDto.getGoldInGms()>1000000000) {
        isInvalid = true;
    }
    else if (surveyDto.getSilverInGms() == 0 || surveyDto.getSilverInGms() < 0||surveyDto.getSilverInGms()>1000000000) {
        isInvalid = true;
    }
    else if (surveyDto.getLandInAcres() == 0 || surveyDto.getLandInAcres() < 0||surveyDto.getLandInAcres()>1000000000) {
        isInvalid = true;
    }
    else if (surveyDto.getTotalSites() == 0 || surveyDto.getTotalSites() < 0||surveyDto.getTotalSites()>1000000000) {
        isInvalid = true;
    }
    else  if (surveyDto.getRtcNumber() == null || surveyDto.getRtcNumber().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getNoOfCows() == 0 || surveyDto.getNoOfCows() < 0||surveyDto.getNoOfCows()>1000000000) {
        isInvalid = true;
    }
    else  if (surveyDto.getIncome() == 0.0 || surveyDto.getIncome() < 0.0||surveyDto.getIncome()>1000000000.0) {
        isInvalid = true;
    }
    else if (surveyDto.getBankAccountType() == null || surveyDto.getBankAccountType().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getShareHolding() == 0 || surveyDto.getShareHolding() < 0||surveyDto.getShareHolding()>1000000000) {
        isInvalid = true;
    }
    else if (surveyDto.getInsuranceCompany() == null || surveyDto.getInsuranceCompany().length() < 3) {
        isInvalid = true;
    }
    else  if (surveyDto.getInsuranceNumber() == null || surveyDto.getInsuranceNumber().length() < 3) {
        isInvalid = true;
    }
    else  if (surveyDto.getLoanNumber() == null || surveyDto.getLoanNumber().length() < 3) {
        isInvalid = true;
    }
    else  if (surveyDto.getLoanBalance() == 0.0 || surveyDto.getLoanBalance() < 0.0||surveyDto.getLoanBalance()>1000000000.0) {
        isInvalid = true;
    }
    else  if (surveyDto.getLoanType() == null || surveyDto.getLoanType().length() < 3) {
        isInvalid = true;
    }
    else  if (surveyDto.getElectricityBillNumber() == null || surveyDto.getElectricityBillNumber().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getWaterBillNumber() == null || surveyDto.getWaterBillNumber().length() < 3) {
        isInvalid = true;
    }
    else if (surveyDto.getTaxesPaid() == 0.0 || surveyDto.getTaxesPaid() < 0.0||surveyDto.getTaxesPaid()>1000000000.0) {
        isInvalid = true;
    }
    else if (surveyDto.getCrop() == null || surveyDto.getCrop().length() < 3) {
        isInvalid = true;
    }
    if (isInvalid) {
        throw new DataInvalidException("Data must be invalid");
    } else {
        System.out.println("SurveyDto validated and saved in SurveyService Impl");
        System.out.println("SurveyDto = " + surveyDto);
    }
}
    }
}
