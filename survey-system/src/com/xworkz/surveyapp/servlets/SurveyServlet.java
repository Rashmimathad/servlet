package com.xworkz.surveyapp.servlets;

import com.xworkz.surveyapp.dto.SurveyDto;
import com.xworkz.surveyapp.exceptions.DataInvalidException;
import com.xworkz.surveyapp.service.SurveyService;
import com.xworkz.surveyapp.service.impl.SurveyServiceImpl;
import com.xworkz.surveyapp.utility.NumberCheckValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/surveyDetails",loadOnStartup = 1)
public class SurveyServlet extends HttpServlet {
    private final SurveyService surveyService = new SurveyServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //personalDetails
        String name = req.getParameter("inputName");
        Integer age = NumberCheckValidation.parseIntSafe(req.getParameter("inputAge"));
        String dateOfBirth = req.getParameter("inputDob");
        Integer height = NumberCheckValidation.parseIntSafe(req.getParameter("inputHeight"));
        Double weight = NumberCheckValidation.parseDoubleSafe(req.getParameter("inputWeight"));
        String education = req.getParameter("inputEducation");
        String occupation = req.getParameter("inputOccupation");
        String nativePlace = req.getParameter("inputNativePlace");
        String motherTongue = req.getParameter("inputMotherTongue");
        String caste = req.getParameter("inputCaste");
        String religion = req.getParameter("inputReligion");
        String complexion = req.getParameter("inputComplexion");
        String bloodGroup = req.getParameter("inputBloodGroup");
        String isDisabled = req.getParameter("inputIsDisabled");
        String knownDiseases = req.getParameter("inputKnownDiseases");

        //Family & Social Details
        String fatherName = req.getParameter("inputFatherName");
        String motherName = req.getParameter("inputMotherName");
        String isMarried = req.getParameter("inputMarried");
        String wifeOrHusbandName = req.getParameter("inputWifeOrHusbandName");
        Integer noOfChildren = NumberCheckValidation.parseIntSafe(req.getParameter("inputNoOfChildren"));
        Integer noOfFamilyMembers = NumberCheckValidation.parseIntSafe(req.getParameter("inputNoOfFamilyMembers"));
        String friendName = req.getParameter("inputFriendName");
        String petName = req.getParameter("inputPetName");

        //Identity & Contact Details
        Long mobileNumber = NumberCheckValidation.parseLongSafe(req.getParameter("inputMobileNumber"));
        Long aadhaarNumber = NumberCheckValidation.parseLongSafe(req.getParameter("inputAadhaarNo"));
        String panCardNumber = req.getParameter("inputPanCardNo");
        String voterIdNumber = req.getParameter("inputVoterIdNo");
        String passportNumber = req.getParameter("inputPassportNo");
        String rationCardNumber = req.getParameter("inputRationCardNo");

        //Assets & Property
        String bikeNumber = req.getParameter("inputBikeNumber");
        String carNumber = req.getParameter("inputCarNumber");
        Integer noOfCycles = NumberCheckValidation.parseIntSafe(req.getParameter("inputNoOfCycles"));
        Integer shoeSize = NumberCheckValidation.parseIntSafe(req.getParameter("inputShoeSize"));
        Integer noOfShoes = NumberCheckValidation.parseIntSafe(req.getParameter("inputNoOfShoePairs"));
        String laptopModel = req.getParameter("inputLaptopModel");
        String tvModel = req.getParameter("inputTvModel");
        Integer goldInGms = NumberCheckValidation.parseIntSafe(req.getParameter("inputGold"));
        Integer silverInGms = NumberCheckValidation.parseIntSafe(req.getParameter("inputSilver"));
        Double landInAcres = NumberCheckValidation.parseDoubleSafe(req.getParameter("inputLand"));
        Integer totalSites = NumberCheckValidation.parseIntSafe(req.getParameter("inputTotalSites"));
        String rtcNumber = req.getParameter("inputRtcNo");
        String buildingOwnerName = req.getParameter("inputBuildingOwnerName");
        Integer noOfCows = NumberCheckValidation.parseIntSafe(req.getParameter("inputNoOfCows"));


        //Finance & Insurance
        Integer income = NumberCheckValidation.parseIntSafe(req.getParameter("inputIncome"));
        String bankAccountType = req.getParameter("inputAccountType");
        Integer shareHolding = NumberCheckValidation.parseIntSafe(req.getParameter("inputNoOfShares"));
        String insuranceCompany = req.getParameter("inputInsuranceCompany");
        String insuranceNumber = req.getParameter("inputInsuranceNumber");
        String loanNumber = req.getParameter("inputLoanNumber");
        Double loanBalance = NumberCheckValidation.parseDoubleSafe(req.getParameter("inputLoanBalance"));
        String loanType = req.getParameter("inputLoanType");


        //Utilities & Miscellaneous
        String electricityBillNumber = req.getParameter("inputElectricityBillNo");
        String waterBillNumber = req.getParameter("inputWaterBillNo");
        Double taxesPaid = NumberCheckValidation.parseDoubleSafe(req.getParameter("inputTaxesPaid"));
        String crop = req.getParameter("inputCrop");



      try {
          SurveyDto surveyDto = new SurveyDto(name, age, dateOfBirth, height, weight, education, occupation, nativePlace, motherTongue, caste, religion, complexion, bloodGroup
                  , isDisabled, knownDiseases, fatherName, motherName, isMarried, wifeOrHusbandName, noOfChildren, noOfFamilyMembers, friendName, petName, mobileNumber, aadhaarNumber,
                  panCardNumber, voterIdNumber, passportNumber, rationCardNumber, bikeNumber, carNumber, noOfCycles, shoeSize, noOfShoes, laptopModel, tvModel, goldInGms, silverInGms, landInAcres
                  , totalSites, rtcNumber, buildingOwnerName, noOfCows, income, bankAccountType, shareHolding, insuranceCompany, insuranceNumber, loanNumber, loanBalance, loanType, electricityBillNumber,
                  waterBillNumber, taxesPaid, crop);
          surveyService.validateAndSave(surveyDto);


          req.setAttribute("name",name);
          req.setAttribute("age", age);
          req.setAttribute("dateOfBirth",dateOfBirth);
          req.setAttribute("height",height);
          req.setAttribute("weight",weight);
          req.setAttribute("education",education);
          req.setAttribute("occupation",occupation);
          req.setAttribute("nativePlace",nativePlace);
          req.setAttribute("motherTongue",motherTongue);
          req.setAttribute("caste",caste);
          req.setAttribute("religion",religion);
          req.setAttribute("complexion",complexion);
          req.setAttribute("bloodGroup",bloodGroup);
          req.setAttribute("isDisabled",isDisabled);
          req.setAttribute("knownDiseases",knownDiseases);

          req.setAttribute("fatherName",fatherName);
          req.setAttribute("motherName",motherName);
          req.setAttribute("isMarried",isMarried);
          req.setAttribute("wifeOrHusbandName",wifeOrHusbandName);
          req.setAttribute("noOfChildren",noOfChildren);
          req.setAttribute("noOfFamilyMembers",noOfFamilyMembers);
          req.setAttribute("friendName",friendName);
          req.setAttribute("petName",petName);

          req.setAttribute("mobileNumber",mobileNumber);
          req.setAttribute("aadhaarNumber",aadhaarNumber);
          req.setAttribute("panCardNumber",panCardNumber);
          req.setAttribute("voterIdNumber",voterIdNumber);
          req.setAttribute("passportNumber",passportNumber);
          req.setAttribute("rationCardNumber",rationCardNumber);

          req.setAttribute("bikeNumber",bikeNumber);
          req.setAttribute("carNumber",carNumber);
          req.setAttribute("noOfCycles",noOfCycles);
          req.setAttribute("shoeSize",shoeSize);
          req.setAttribute("noOfShoes",noOfShoes);
          req.setAttribute("laptopModel",laptopModel);
          req.setAttribute("tvModel",tvModel);
          req.setAttribute("goldInGms",goldInGms);
          req.setAttribute("silverInGms",silverInGms);
          req.setAttribute("landInAcres",landInAcres);
          req.setAttribute("totalSites",totalSites);
          req.setAttribute("rtcNumber",rtcNumber);
          req.setAttribute("buildingOwnerName",buildingOwnerName);
          req.setAttribute("noOfCows",noOfCows);

          req.setAttribute("income",income);
          req.setAttribute("bankAccountType",bankAccountType);
          req.setAttribute("shareHolding",shareHolding);
          req.setAttribute("insuranceCompany",insuranceCompany);
          req.setAttribute("insuranceNumber",insuranceNumber);
          req.setAttribute("loanNumber",loanNumber);
          req.setAttribute("loanBalance",loanBalance);
          req.setAttribute("loanType",loanType);

          req.setAttribute("electricityBillNumber",electricityBillNumber);
          req.setAttribute("waterBillNumber",waterBillNumber);
          req.setAttribute("taxesPaid",taxesPaid);
          req.setAttribute("crop",crop);

          req.setAttribute("successMessage","Data Saved Successfully!!!!");
      }catch (DataInvalidException e){
          req.setAttribute("errorMessage","Data not Saved Successfully!!!!");
      }


        req.getRequestDispatcher("SurveyResult.jsp").forward(req,resp);

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("SurveyForm.jsp").forward(req,resp);
    }


}

