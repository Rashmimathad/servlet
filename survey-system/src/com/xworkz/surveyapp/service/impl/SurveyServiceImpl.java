package com.xworkz.surveyapp.service.impl;

import com.xworkz.surveyapp.dto.SurveyDTO;
import com.xworkz.surveyapp.exceptions.DataInvalidException;
import com.xworkz.surveyapp.service.SurveyService;

public class SurveyServiceImpl implements SurveyService {
    @Override
    public void validateAndSave(SurveyDTO surveyDto) throws DataInvalidException {

        boolean isInvalid=false;
        if(surveyDto!=null) {
            if (surveyDto.getPersonalDetailsDTO().getName() == null || surveyDto.getPersonalDetailsDTO().getName().length() < 3) {
                System.err.println("Invalid Name");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getAge() == 0 || surveyDto.getPersonalDetailsDTO().getAge() < 0 || surveyDto.getPersonalDetailsDTO().getAge() > 1000000000) {
                System.err.println("Invalid Age");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getDateOfBirth() == null || surveyDto.getPersonalDetailsDTO().getDateOfBirth().length() < 3) {
                System.err.println("Invalid Date Of Birth");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getHeight() == 0 || surveyDto.getPersonalDetailsDTO().getHeight() < 0 || surveyDto.getPersonalDetailsDTO().getHeight() > 1000000000) {
                System.err.println("Invalid height");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getWeight() == 0.0 || surveyDto.getPersonalDetailsDTO().getWeight() < 0.0 || surveyDto.getPersonalDetailsDTO().getWeight() > 1000000000.0) {
                System.err.println("Invalid Weight");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getEducation() == null || surveyDto.getPersonalDetailsDTO().getEducation().length() < 3) {
                System.err.println("Invalid education detail");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getOccupation() == null || surveyDto.getPersonalDetailsDTO().getOccupation().length() < 3) {
                System.err.println("Invalid occupation");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getNativePlace() == null || surveyDto.getPersonalDetailsDTO().getNativePlace().length() < 3) {
                System.err.println("Invalid native place");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getMotherTongue() == null || surveyDto.getPersonalDetailsDTO().getMotherTongue().length() < 3) {
                System.err.println("Invalid mother tongue");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getCaste() == null || surveyDto.getPersonalDetailsDTO().getCaste().length() < 3) {
                System.err.println("Invalid caste");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getReligion() == null || surveyDto.getPersonalDetailsDTO().getReligion().length() < 3) {
                System.err.println("Invalid religion");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getComplexion() == null || surveyDto.getPersonalDetailsDTO().getComplexion().length() < 3) {
                System.err.println("Invalid complexion");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getBloodGroup() == null || surveyDto.getPersonalDetailsDTO().getBloodGroup().length() < 3) {
                System.err.println("Invalid blood group");
                isInvalid = true;
            } else if (surveyDto.getPersonalDetailsDTO().getKnownDiseases() == null || surveyDto.getPersonalDetailsDTO().getKnownDiseases().length() < 3) {
                System.err.println("Invalid known diseases");
                isInvalid = true;
            } else if (surveyDto.getFamilyDTO().getFatherName() == null || surveyDto.getFamilyDTO().getFatherName().length() < 3) {
                System.err.println("Invalid father name");
                isInvalid = true;
            } else if (surveyDto.getFamilyDTO().getMotherName() == null || surveyDto.getFamilyDTO().getMotherName().length() < 3) {
                System.err.println("Invalid mother name");
                isInvalid = true;
            } else if (surveyDto.getFamilyDTO().getWifeOrHusbandName() == null || surveyDto.getFamilyDTO().getWifeOrHusbandName().length() < 3) {
                System.err.println("Invalid wife or husband name");
                isInvalid = true;
            } else if (surveyDto.getFamilyDTO().getNoOfChildren() == 0 || surveyDto.getFamilyDTO().getNoOfChildren() < 0 || surveyDto.getFamilyDTO().getNoOfChildren() > 1000000000) {
                System.err.println("Invalid no of children");
                isInvalid = true;
            } else if (surveyDto.getFamilyDTO().getNoOfFamilyMembers() == 0 || surveyDto.getFamilyDTO().getNoOfFamilyMembers() < 0 || surveyDto.getFamilyDTO().getNoOfFamilyMembers() > 1000000000) {
                System.err.println("Invalid no of family members");
                isInvalid = true;
            } else if (surveyDto.getFamilyDTO().getFriendName() == null || surveyDto.getFamilyDTO().getFriendName().length() < 3) {
                System.err.println("Invalid friend name");
                isInvalid = true;
            } else if (surveyDto.getFamilyDTO().getPetName() == null || surveyDto.getFamilyDTO().getPetName().length() < 3) {
                System.err.println("Invalid pet name");
                isInvalid = true;
            } else if (surveyDto.getContactDTO().getMobileNumber() == 0 || surveyDto.getContactDTO().getMobileNumber() < 0) {
                System.err.println("Invalid mobile number");
                isInvalid = true;
            } else if (surveyDto.getContactDTO().getAadhaarNumber() == 0 || surveyDto.getContactDTO().getAadhaarNumber() < 0) {
                System.err.println("Invalid aadhaar number");
                isInvalid = true;
            } else if (surveyDto.getContactDTO().getPanCardNumber() == null || surveyDto.getContactDTO().getPanCardNumber().length() < 3) {
                System.err.println("Invalid pan card number");
                isInvalid = true;
            } else if (surveyDto.getContactDTO().getVoterIdNumber() == null || surveyDto.getContactDTO().getVoterIdNumber().length() < 3) {
                System.err.println("Invalid voter id number");
                isInvalid = true;
            } else if (surveyDto.getContactDTO().getPassportNumber() == null || surveyDto.getContactDTO().getPassportNumber().length() < 3) {
                System.err.println("Invalid passport number");
                isInvalid = true;
            } else if (surveyDto.getContactDTO().getRationCardNumber() == null || surveyDto.getContactDTO().getRationCardNumber().length() < 3) {
                System.err.println("Invalid ration card number");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getBikeNumber() == null || surveyDto.getPropertyDTO().getBikeNumber().length() < 3) {
                System.err.println("Invalid bike number");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getCarNumber() == null || surveyDto.getPropertyDTO().getCarNumber().length() < 3) {
                System.err.println("Invalid car number");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getNoOfCycles() == 0 || surveyDto.getPropertyDTO().getNoOfCycles() < 0 || surveyDto.getPropertyDTO().getNoOfCycles() > 1000000000) {
                System.err.println("Invalid no of cycles");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getShoeSize() == 0 || surveyDto.getPropertyDTO().getShoeSize() < 0 || surveyDto.getPropertyDTO().getShoeSize() > 1000000000) {
                System.err.println("Invalid shoe size");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getNoOfShoes() == 0 || surveyDto.getPropertyDTO().getNoOfShoes() < 0 || surveyDto.getPropertyDTO().getNoOfShoes() > 1000000000) {
                System.err.println("Invalid no of shoes");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getLaptopModel() == null || surveyDto.getPropertyDTO().getLaptopModel().length() < 3) {
                System.err.println("Invalid laptop model");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getTvModel() == null || surveyDto.getPropertyDTO().getTvModel().length() < 3) {
                System.err.println("Invalid tv model");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getGoldInGms() == 0 || surveyDto.getPropertyDTO().getGoldInGms() < 0 || surveyDto.getPropertyDTO().getGoldInGms() > 1000000000) {
                System.err.println("Invalid gold quantity ");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getSilverInGms() == 0 || surveyDto.getPropertyDTO().getSilverInGms() < 0 || surveyDto.getPropertyDTO().getSilverInGms() > 1000000000) {
                System.err.println("Invalid silver quantity");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getLandInAcres() == 0 || surveyDto.getPropertyDTO().getLandInAcres() < 0 || surveyDto.getPropertyDTO().getLandInAcres() > 1000000000) {
                System.err.println("Invalid land in acres");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getTotalSites() == 0 || surveyDto.getPropertyDTO().getTotalSites() < 0 || surveyDto.getPropertyDTO().getTotalSites() > 1000000000) {
                System.err.println("Invalid total sites");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getRtcNumber() == null || surveyDto.getPropertyDTO().getRtcNumber().length() < 3) {
                System.err.println("Invalid Rtc number");
                isInvalid = true;
            } else if (surveyDto.getPropertyDTO().getNoOfCows() == 0 || surveyDto.getPropertyDTO().getNoOfCows() < 0 || surveyDto.getPropertyDTO().getNoOfCows() > 1000000000) {
                System.err.println("Invalid no of cows");
                isInvalid = true;
            } else if (surveyDto.getFinanceDTO().getIncome() == 0.0 || surveyDto.getFinanceDTO().getIncome() < 0.0 || surveyDto.getFinanceDTO().getIncome() > 1000000000.0) {
                System.err.println("Invalid income");
                isInvalid = true;
            } else if (surveyDto.getFinanceDTO().getBankAccountType() == null || surveyDto.getFinanceDTO().getBankAccountType().length() < 3) {
                System.err.println("Invalid bank account");
                isInvalid = true;
            } else if (surveyDto.getFinanceDTO().getShareHolding() == 0 || surveyDto.getFinanceDTO().getShareHolding() < 0 || surveyDto.getFinanceDTO().getShareHolding() > 1000000000) {
                System.err.println("Invalid share holding");
                isInvalid = true;
            } else if (surveyDto.getFinanceDTO().getInsuranceCompany() == null || surveyDto.getFinanceDTO().getInsuranceCompany().length() < 3) {
                System.err.println("Invalid insurance company");
                isInvalid = true;
            } else if (surveyDto.getFinanceDTO().getInsuranceNumber() == null || surveyDto.getFinanceDTO().getInsuranceNumber().length() < 3) {
                System.err.println("Invalid insurance number");
                isInvalid = true;
            } else if (surveyDto.getFinanceDTO().getLoanNumber() == null || surveyDto.getFinanceDTO().getLoanNumber().length() < 3) {
                System.err.println("Invalid loan number");
                isInvalid = true;
            } else if (surveyDto.getFinanceDTO().getLoanBalance() == 0.0 || surveyDto.getFinanceDTO().getLoanBalance() < 0.0 || surveyDto.getFinanceDTO().getLoanBalance() > 1000000000.0) {
                System.err.println("Invalid loan balance");
                isInvalid = true;
            } else if (surveyDto.getFinanceDTO().getLoanType() == null || surveyDto.getFinanceDTO().getLoanType().length() < 3) {
                System.err.println("Invalid loan type");
                isInvalid = true;
            } else if (surveyDto.getUtilitiesDTO().getElectricityBillNumber() == null || surveyDto.getUtilitiesDTO().getElectricityBillNumber().length() < 3) {
                System.err.println("Invalid electricity bill number");
                isInvalid = true;
            } else if (surveyDto.getUtilitiesDTO().getWaterBillNumber() == null || surveyDto.getUtilitiesDTO().getWaterBillNumber().length() < 3) {
                System.err.println("Invalid water bill number");
                isInvalid = true;
            } else if (surveyDto.getUtilitiesDTO().getTaxesPaid() == 0.0 || surveyDto.getUtilitiesDTO().getTaxesPaid() < 0.0 || surveyDto.getUtilitiesDTO().getTaxesPaid() > 1000000000.0) {
                System.err.println("Invalid taxes paid");
                isInvalid = true;
            } else if (surveyDto.getUtilitiesDTO().getCrop() == null || surveyDto.getUtilitiesDTO().getCrop().length() < 3) {
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