package com.xworkz.surveyapp.dto;

import java.io.Serializable;
import java.util.Objects;

public class SurveyDto implements Serializable,Comparable<String> {

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

    //Family & Social Details
    private String fatherName;
    private String motherName;
    private String isMarried;
    private String wifeOrHusbandName;
    private Integer noOfChildren;
    private Integer noOfFamilyMembers;
    private String friendName;
    private String petName;

    //Identity & Contact Details
    private Long mobileNumber;
    private Long aadhaarNumber;
    private String panCardNumber;
    private String voterIdNumber;
    private String passportNumber;
    private String rationCardNumber;

    //Assets & Property
    private String bikeNumber;
    private String carNumber;
    private Integer noOfCycles;
    private Integer shoeSize;
    private Integer noOfShoes;
    private String laptopModel;
    private String tvModel;
    private Integer goldInGms;
    private Integer silverInGms;
    private Double landInAcres;
    private Integer totalSites;
    private String rtcNumber;
    private String buildingOwnerName;
    private Integer noOfCows;


    //Finance & Insurance
    private Integer income;
    private String bankAccountType;
    private Integer shareHolding;
    private String insuranceCompany;
    private String insuranceNumber;
    private String loanNumber;
    private Double loanBalance;
    private String loanType;


    //Utilities & Miscellaneous
    private String electricityBillNumber;
    private String waterBillNumber;
    private Double taxesPaid;
    private String crop;
    public SurveyDto(){

    }

    @Override
    public String toString() {
        return "SurveyDto{" +
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
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", isMarried='" + isMarried + '\'' +
                ", wifeOrHusbandName='" + wifeOrHusbandName + '\'' +
                ", noOfChildren=" + noOfChildren +
                ", noOfFamilyMembers=" + noOfFamilyMembers +
                ", friendName='" + friendName + '\'' +
                ", petName='" + petName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", aadhaarNumber=" + aadhaarNumber +
                ", panCardNumber='" + panCardNumber + '\'' +
                ", voterIdNumber='" + voterIdNumber + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", rationCardNumber='" + rationCardNumber + '\'' +
                ", bikeNumber='" + bikeNumber + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", noOfCycles=" + noOfCycles +
                ", shoeSize=" + shoeSize +
                ", noOfShoes=" + noOfShoes +
                ", laptopModel='" + laptopModel + '\'' +
                ", tvModel='" + tvModel + '\'' +
                ", goldInGms=" + goldInGms +
                ", silverInGms=" + silverInGms +
                ", landInAcres=" + landInAcres +
                ", totalSites=" + totalSites +
                ", rtcNumber='" + rtcNumber + '\'' +
                ", buildingOwnerName='" + buildingOwnerName + '\'' +
                ", noOfCows=" + noOfCows +
                ", income=" + income +
                ", bankAccountType='" + bankAccountType + '\'' +
                ", shareHolding=" + shareHolding +
                ", insuranceCompany='" + insuranceCompany + '\'' +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ", loanNumber='" + loanNumber + '\'' +
                ", loanBalance=" + loanBalance +
                ", loanType='" + loanType + '\'' +
                ", electricityBillNumber='" + electricityBillNumber + '\'' +
                ", waterBillNumber='" + waterBillNumber + '\'' +
                ", taxesPaid=" + taxesPaid +
                ", crop='" + crop + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SurveyDto surveyDto = (SurveyDto) o;
        return Objects.equals(name, surveyDto.name) && Objects.equals(age, surveyDto.age) && Objects.equals(dateOfBirth, surveyDto.dateOfBirth) && Objects.equals(height, surveyDto.height) && Objects.equals(weight, surveyDto.weight) && Objects.equals(education, surveyDto.education) && Objects.equals(occupation, surveyDto.occupation) && Objects.equals(nativePlace, surveyDto.nativePlace) && Objects.equals(motherTongue, surveyDto.motherTongue) && Objects.equals(caste, surveyDto.caste) && Objects.equals(religion, surveyDto.religion) && Objects.equals(complexion, surveyDto.complexion) && Objects.equals(bloodGroup, surveyDto.bloodGroup) && Objects.equals(isDisabled, surveyDto.isDisabled) && Objects.equals(knownDiseases, surveyDto.knownDiseases) && Objects.equals(fatherName, surveyDto.fatherName) && Objects.equals(motherName, surveyDto.motherName) && Objects.equals(isMarried, surveyDto.isMarried) && Objects.equals(wifeOrHusbandName, surveyDto.wifeOrHusbandName) && Objects.equals(noOfChildren, surveyDto.noOfChildren) && Objects.equals(noOfFamilyMembers, surveyDto.noOfFamilyMembers) && Objects.equals(friendName, surveyDto.friendName) && Objects.equals(petName, surveyDto.petName) && Objects.equals(mobileNumber, surveyDto.mobileNumber) && Objects.equals(aadhaarNumber, surveyDto.aadhaarNumber) && Objects.equals(panCardNumber, surveyDto.panCardNumber) && Objects.equals(voterIdNumber, surveyDto.voterIdNumber) && Objects.equals(passportNumber, surveyDto.passportNumber) && Objects.equals(rationCardNumber, surveyDto.rationCardNumber) && Objects.equals(bikeNumber, surveyDto.bikeNumber) && Objects.equals(carNumber, surveyDto.carNumber) && Objects.equals(noOfCycles, surveyDto.noOfCycles) && Objects.equals(shoeSize, surveyDto.shoeSize) && Objects.equals(noOfShoes, surveyDto.noOfShoes) && Objects.equals(laptopModel, surveyDto.laptopModel) && Objects.equals(tvModel, surveyDto.tvModel) && Objects.equals(goldInGms, surveyDto.goldInGms) && Objects.equals(silverInGms, surveyDto.silverInGms) && Objects.equals(landInAcres, surveyDto.landInAcres) && Objects.equals(totalSites, surveyDto.totalSites) && Objects.equals(rtcNumber, surveyDto.rtcNumber) && Objects.equals(buildingOwnerName, surveyDto.buildingOwnerName) && Objects.equals(noOfCows, surveyDto.noOfCows) && Objects.equals(income, surveyDto.income) && Objects.equals(bankAccountType, surveyDto.bankAccountType) && Objects.equals(shareHolding, surveyDto.shareHolding) && Objects.equals(insuranceCompany, surveyDto.insuranceCompany) && Objects.equals(insuranceNumber, surveyDto.insuranceNumber) && Objects.equals(loanNumber, surveyDto.loanNumber) && Objects.equals(loanBalance, surveyDto.loanBalance) && Objects.equals(loanType, surveyDto.loanType) && Objects.equals(electricityBillNumber, surveyDto.electricityBillNumber) && Objects.equals(waterBillNumber, surveyDto.waterBillNumber) && Objects.equals(taxesPaid, surveyDto.taxesPaid) && Objects.equals(crop, surveyDto.crop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dateOfBirth, height, weight, education, occupation, nativePlace, motherTongue, caste, religion, complexion, bloodGroup, isDisabled, knownDiseases, fatherName, motherName, isMarried, wifeOrHusbandName, noOfChildren, noOfFamilyMembers, friendName, petName, mobileNumber, aadhaarNumber, panCardNumber, voterIdNumber, passportNumber, rationCardNumber, bikeNumber, carNumber, noOfCycles, shoeSize, noOfShoes, laptopModel, tvModel, goldInGms, silverInGms, landInAcres, totalSites, rtcNumber, buildingOwnerName, noOfCows, income, bankAccountType, shareHolding, insuranceCompany, insuranceNumber, loanNumber, loanBalance, loanType, electricityBillNumber, waterBillNumber, taxesPaid, crop);
    }



    public Integer getSilverInGms() {
        return silverInGms;
    }

    public void setSilverInGms(Integer silverInGms) {
        this.silverInGms = silverInGms;
    }

    public Double getLandInAcres() {
        return landInAcres;
    }

    public void setLandInAcres(Double landInAcres) {
        this.landInAcres = landInAcres;
    }

    public Integer getTotalSites() {
        return totalSites;
    }

    public void setTotalSites(Integer totalSites) {
        this.totalSites = totalSites;
    }

    public String getRtcNumber() {
        return rtcNumber;
    }

    public void setRtcNumber(String rtcNumber) {
        this.rtcNumber = rtcNumber;
    }

    public String getBuildingOwnerName() {
        return buildingOwnerName;
    }

    public void setBuildingOwnerName(String buildingOwnerName) {
        this.buildingOwnerName = buildingOwnerName;
    }

    public Integer getNoOfCows() {
        return noOfCows;
    }

    public void setNoOfCows(Integer noOfCows) {
        this.noOfCows = noOfCows;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getShareHolding() {
        return shareHolding;
    }

    public void setShareHolding(Integer shareHolding) {
        this.shareHolding = shareHolding;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public Double getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(Double loanBalance) {
        this.loanBalance = loanBalance;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getElectricityBillNumber() {
        return electricityBillNumber;
    }

    public void setElectricityBillNumber(String electricityBillNumber) {
        this.electricityBillNumber = electricityBillNumber;
    }

    public String getWaterBillNumber() {
        return waterBillNumber;
    }

    public void setWaterBillNumber(String waterBillNumber) {
        this.waterBillNumber = waterBillNumber;
    }

    public Double getTaxesPaid() {
        return taxesPaid;
    }

    public void setTaxesPaid(Double taxesPaid) {
        this.taxesPaid = taxesPaid;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public Integer getGoldInGms() {
        return goldInGms;
    }

    public void setGoldInGms(Integer goldInGms) {
        this.goldInGms = goldInGms;
    }

    public String getTvModel() {
        return tvModel;
    }

    public void setTvModel(String tvModel) {
        this.tvModel = tvModel;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public void setLaptopModel(String laptopModel) {
        this.laptopModel = laptopModel;
    }

    public Integer getNoOfShoes() {
        return noOfShoes;
    }

    public void setNoOfShoes(Integer noOfShoes) {
        this.noOfShoes = noOfShoes;
    }

    public Integer getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(Integer shoeSize) {
        this.shoeSize = shoeSize;
    }

    public Integer getNoOfCycles() {
        return noOfCycles;
    }

    public void setNoOfCycles(Integer noOfCycles) {
        this.noOfCycles = noOfCycles;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getBikeNumber() {
        return bikeNumber;
    }

    public void setBikeNumber(String bikeNumber) {
        this.bikeNumber = bikeNumber;
    }

    public String getRationCardNumber() {
        return rationCardNumber;
    }

    public void setRationCardNumber(String rationCardNumber) {
        this.rationCardNumber = rationCardNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getVoterIdNumber() {
        return voterIdNumber;
    }

    public void setVoterIdNumber(String voterIdNumber) {
        this.voterIdNumber = voterIdNumber;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public void setPanCardNumber(String panCardNumber) {
        this.panCardNumber = panCardNumber;
    }

    public Long getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(Long aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public Integer getNoOfFamilyMembers() {
        return noOfFamilyMembers;
    }

    public void setNoOfFamilyMembers(Integer noOfFamilyMembers) {
        this.noOfFamilyMembers = noOfFamilyMembers;
    }

    public Integer getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(Integer noOfChildren) {
        this.noOfChildren = noOfChildren;
    }

    public String getWifeOrHusbandName() {
        return wifeOrHusbandName;
    }

    public void setWifeOrHusbandName(String wifeOrHusbandName) {
        this.wifeOrHusbandName = wifeOrHusbandName;
    }

    public String getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(String isMarried) {
        this.isMarried = isMarried;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getKnownDiseases() {
        return knownDiseases;
    }

    public void setKnownDiseases(String knownDiseases) {
        this.knownDiseases = knownDiseases;
    }

    public String getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(String isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }



    public SurveyDto(String name,Integer age,String dateOfBirth,Integer height,Double weight,String education,String occupation,String nativePlace,String motherTongue,String caste,String religion,String complexion,String bloodGroup,String isDisabled,String knownDiseases,String fatherName,String motherName,String isMarried,String wifeOrHusbandName,Integer noOfChildren,Integer noOfFamilyMembers,String friendName,String petName,
                     Long mobileNumber,Long aadhaarNumber,String panCardNumber,String voterIdNumber,String passportNumber,String rationCardNumber,String bikeNumber,String carNumber,Integer noOfCycles,Integer shoeSize,Integer noOfShoes,String laptopModel,String tvModel,Integer goldInGms,Integer silverInGms,Double landInAcres,Integer totalSites,String rtcNumber,String buildingOwnerName,Integer noOfCows,Integer income,String bankAccountType,Integer shareHolding,String insuranceCompany,String insuranceNumber,String loanNumber,Double loanBalance,String loanType,String electricityBillNumber,String waterBillNumber,Double taxesPaid,String crop){

        this.name=name;
        this.age=age;
        this.dateOfBirth=dateOfBirth;
        this.height=height;
        this.weight=weight;
        this.education=education;
        this.occupation=occupation;
        this.nativePlace=nativePlace;
        this.motherTongue=motherTongue;
        this.caste=caste;
        this.religion=religion;
        this.complexion=complexion;
        this.bloodGroup=bloodGroup;
        this.isDisabled=isDisabled;
        this.knownDiseases=knownDiseases;
        this.fatherName=fatherName;
        this.motherName=motherName;
        this.isMarried=isMarried;
        this.wifeOrHusbandName=wifeOrHusbandName;
        this.noOfChildren=noOfChildren;
        this.noOfFamilyMembers=noOfFamilyMembers;
        this.friendName=friendName;
        this.petName=petName;
        this.mobileNumber=mobileNumber;
        this.aadhaarNumber=aadhaarNumber;
        this.panCardNumber=panCardNumber;
        this.voterIdNumber=voterIdNumber;
        this.passportNumber=passportNumber;
        this.rationCardNumber=rationCardNumber;
        this.bikeNumber=bikeNumber;
        this.carNumber=carNumber;
        this.noOfCycles=noOfCycles;
        this.shoeSize=shoeSize;
        this.noOfShoes=noOfShoes;
        this.laptopModel=laptopModel;
        this.tvModel=tvModel;
        this.goldInGms=goldInGms;
        this.silverInGms=silverInGms;
        this.landInAcres=landInAcres;
        this.totalSites=totalSites;
        this.rtcNumber=rtcNumber;
        this.buildingOwnerName=buildingOwnerName;
        this.noOfCows=noOfCows;
        this.income=income;
        this.bankAccountType=bankAccountType;
        this.shareHolding=shareHolding;
        this.insuranceCompany=insuranceCompany;
        this.insuranceNumber=insuranceNumber;
        this.loanNumber=loanNumber;
        this.loanBalance=loanBalance;
        this.loanType=loanType;
        this.electricityBillNumber=electricityBillNumber;
        this.waterBillNumber=waterBillNumber;
        this.taxesPaid=taxesPaid;
        this.crop=crop;

    }



    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }
}
