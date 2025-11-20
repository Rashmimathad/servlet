package com.xworkz.surveyapp.service.impl;

import com.xworkz.surveyapp.dto.SurveyDto;
import com.xworkz.surveyapp.exceptions.DataInvalidException;
import com.xworkz.surveyapp.service.SurveyService;

public class SurveyServiceImpl implements SurveyService {
    @Override
    public void validateAndSave(SurveyDto surveyDto) throws DataInvalidException {

        boolean isInvalid=false;
        if(surveyDto!=null) {
            if (surveyDto.getName() == null || surveyDto.getName().length() < 3) {
                System.err.println("Invalid Name");
                isInvalid = true;
            } else if (surveyDto.getAge() == 0 || surveyDto.getAge() < 0 || surveyDto.getAge() > 1000000000) {
                System.err.println("Invalid Age");
                isInvalid = true;
            } else if (surveyDto.getDateOfBirth() == null || surveyDto.getDateOfBirth().length() < 3) {
                System.err.println("Invalid Date Of Birth");
                isInvalid = true;
            } else if (surveyDto.getHeight() == 0 || surveyDto.getHeight() < 0 || surveyDto.getHeight() > 1000000000) {
                System.err.println("Invalid height");
                isInvalid = true;
            } else if (surveyDto.getWeight() == 0.0 || surveyDto.getWeight() < 0.0 || surveyDto.getWeight() > 1000000000.0) {
                System.err.println("Invalid Weight");
                isInvalid = true;
            } else if (surveyDto.getEducation() == null || surveyDto.getEducation().length() < 3) {
                System.err.println("Invalid education detail");
                isInvalid = true;
            } else if (surveyDto.getOccupation() == null || surveyDto.getOccupation().length() < 3) {
                System.err.println("Invalid occupation");
                isInvalid = true;
            } else if (surveyDto.getNativePlace() == null || surveyDto.getNativePlace().length() < 3) {
                System.err.println("Invalid native place");
                isInvalid = true;
            } else if (surveyDto.getMotherTongue() == null || surveyDto.getMotherTongue().length() < 3) {
                System.err.println("Invalid mother tongue");
                isInvalid = true;
            } else if (surveyDto.getCaste() == null || surveyDto.getCaste().length() < 3) {
                System.err.println("Invalid caste");
                isInvalid = true;
            } else if (surveyDto.getReligion() == null || surveyDto.getReligion().length() < 3) {
                System.err.println("Invalid religion");
                isInvalid = true;
            } else if (surveyDto.getComplexion() == null || surveyDto.getComplexion().length() < 3) {
                System.err.println("Invalid complexion");
                isInvalid = true;
            } else if (surveyDto.getBloodGroup() == null || surveyDto.getBloodGroup().length() < 3) {
                System.err.println("Invalid blood group");
                isInvalid = true;
            } else if (surveyDto.getKnownDiseases() == null || surveyDto.getKnownDiseases().length() < 3) {
                System.err.println("Invalid known diseases");
                isInvalid = true;
            } else if (surveyDto.getFatherName() == null || surveyDto.getFatherName().length() < 3) {
                System.err.println("Invalid father name");
                isInvalid = true;
            } else if (surveyDto.getMotherName() == null || surveyDto.getMotherName().length() < 3) {
                System.err.println("Invalid mother name");
                isInvalid = true;
            } else if (surveyDto.getWifeOrHusbandName() == null || surveyDto.getWifeOrHusbandName().length() < 3) {
                System.err.println("Invalid wife or husband name");
                isInvalid = true;
            } else if (surveyDto.getNoOfChildren() == 0 || surveyDto.getNoOfChildren() < 0 || surveyDto.getNoOfChildren() > 1000000000) {
                System.err.println("Invalid no of children");
                isInvalid = true;
            } else if (surveyDto.getNoOfFamilyMembers() == 0 || surveyDto.getNoOfFamilyMembers() < 0 || surveyDto.getNoOfFamilyMembers() > 1000000000) {
                System.err.println("Invalid no of family members");
                isInvalid = true;
            } else if (surveyDto.getFriendName() == null || surveyDto.getFriendName().length() < 3) {
                System.err.println("Invalid friend name");
                isInvalid = true;
            } else if (surveyDto.getPetName() == null || surveyDto.getPetName().length() < 3) {
                System.err.println("Invalid pet name");
                isInvalid = true;
            } else if (surveyDto.getMobileNumber() == 0 || surveyDto.getMobileNumber() < 0) {
                System.err.println("Invalid mobile number");
                isInvalid = true;
            } else if (surveyDto.getAadhaarNumber() == 0 || surveyDto.getAadhaarNumber() < 0) {
                System.err.println("Invalid aadhaar number");
                isInvalid = true;
            } else if (surveyDto.getPanCardNumber() == null || surveyDto.getPanCardNumber().length() < 3) {
                System.err.println("Invalid pan card number");
                isInvalid = true;
            } else if (surveyDto.getVoterIdNumber() == null || surveyDto.getVoterIdNumber().length() < 3) {
                System.err.println("Invalid voter id number");
                isInvalid = true;
            } else if (surveyDto.getPassportNumber() == null || surveyDto.getPassportNumber().length() < 3) {
                System.err.println("Invalid passport number");
                isInvalid = true;
            } else if (surveyDto.getRationCardNumber() == null || surveyDto.getRationCardNumber().length() < 3) {
                System.err.println("Invalid ration card number");
                isInvalid = true;
            } else if (surveyDto.getBikeNumber() == null || surveyDto.getBikeNumber().length() < 3) {
                System.err.println("Invalid bike number");
                isInvalid = true;
            } else if (surveyDto.getCarNumber() == null || surveyDto.getCarNumber().length() < 3) {
                System.err.println("Invalid car number");
                isInvalid = true;
            } else if (surveyDto.getNoOfCycles() == 0 || surveyDto.getNoOfCycles() < 0 || surveyDto.getNoOfCycles() > 1000000000) {
                System.err.println("Invalid no of cycles");
                isInvalid = true;
            } else if (surveyDto.getShoeSize() == 0 || surveyDto.getShoeSize() < 0 || surveyDto.getShoeSize() > 1000000000) {
                System.err.println("Invalid shoe size");
                isInvalid = true;
            } else if (surveyDto.getNoOfShoes() == 0 || surveyDto.getNoOfShoes() < 0 || surveyDto.getNoOfShoes() > 1000000000) {
                System.err.println("Invalid no of shoes");
                isInvalid = true;
            } else if (surveyDto.getLaptopModel() == null || surveyDto.getLaptopModel().length() < 3) {
                System.err.println("Invalid laptop model");
                isInvalid = true;
            } else if (surveyDto.getTvModel() == null || surveyDto.getTvModel().length() < 3) {
                System.err.println("Invalid tv model");
                isInvalid = true;
            } else if (surveyDto.getGoldInGms() == 0 || surveyDto.getGoldInGms() < 0 || surveyDto.getGoldInGms() > 1000000000) {
                System.err.println("Invalid gold quantity ");
                isInvalid = true;
            } else if (surveyDto.getSilverInGms() == 0 || surveyDto.getSilverInGms() < 0 || surveyDto.getSilverInGms() > 1000000000) {
                System.err.println("Invalid silver quantity");
                isInvalid = true;
            } else if (surveyDto.getLandInAcres() == 0 || surveyDto.getLandInAcres() < 0 || surveyDto.getLandInAcres() > 1000000000) {
                System.err.println("Invalid land in acres");
                isInvalid = true;
            } else if (surveyDto.getTotalSites() == 0 || surveyDto.getTotalSites() < 0 || surveyDto.getTotalSites() > 1000000000) {
                System.err.println("Invalid total sites");
                isInvalid = true;
            } else if (surveyDto.getRtcNumber() == null || surveyDto.getRtcNumber().length() < 3) {
                System.err.println("Invalid Rtc number");
                isInvalid = true;
            } else if (surveyDto.getNoOfCows() == 0 || surveyDto.getNoOfCows() < 0 || surveyDto.getNoOfCows() > 1000000000) {
                System.err.println("Invalid no of cows");
                isInvalid = true;
            } else if (surveyDto.getIncome() == 0.0 || surveyDto.getIncome() < 0.0 || surveyDto.getIncome() > 1000000000.0) {
                System.err.println("Invalid income");
                isInvalid = true;
            } else if (surveyDto.getBankAccountType() == null || surveyDto.getBankAccountType().length() < 3) {
                System.err.println("Invalid bank account");
                isInvalid = true;
            } else if (surveyDto.getShareHolding() == 0 || surveyDto.getShareHolding() < 0 || surveyDto.getShareHolding() > 1000000000) {
                System.err.println("Invalid share holding");
                isInvalid = true;
            } else if (surveyDto.getInsuranceCompany() == null || surveyDto.getInsuranceCompany().length() < 3) {
                System.err.println("Invalid insurance company");
                isInvalid = true;
            } else if (surveyDto.getInsuranceNumber() == null || surveyDto.getInsuranceNumber().length() < 3) {
                System.err.println("Invalid insurance number");
                isInvalid = true;
            } else if (surveyDto.getLoanNumber() == null || surveyDto.getLoanNumber().length() < 3) {
                System.err.println("Invalid loan number");
                isInvalid = true;
            } else if (surveyDto.getLoanBalance() == 0.0 || surveyDto.getLoanBalance() < 0.0 || surveyDto.getLoanBalance() > 1000000000.0) {
                System.err.println("Invalid loan balance");
                isInvalid = true;
            } else if (surveyDto.getLoanType() == null || surveyDto.getLoanType().length() < 3) {
                System.err.println("Invalid loan type");
                isInvalid = true;
            } else if (surveyDto.getElectricityBillNumber() == null || surveyDto.getElectricityBillNumber().length() < 3) {
                System.err.println("Invalid electricity bill number");
                isInvalid = true;
            } else if (surveyDto.getWaterBillNumber() == null || surveyDto.getWaterBillNumber().length() < 3) {
                System.err.println("Invalid water bill number");
                isInvalid = true;
            } else if (surveyDto.getTaxesPaid() == 0.0 || surveyDto.getTaxesPaid() < 0.0 || surveyDto.getTaxesPaid() > 1000000000.0) {
                System.err.println("Invalid taxes paid");
                isInvalid = true;
            } else if (surveyDto.getCrop() == null || surveyDto.getCrop().length() < 3) {
                System.err.println("Invalid crop");
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
