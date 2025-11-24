package com.xworkz.surveyapp.dto;

import java.io.Serializable;
import java.util.Objects;

public class FinanceDTO implements Serializable,Comparable<String> {
    private Integer income;
    private String bankAccountType;
    private Integer shareHolding;
    private String insuranceCompany;
    private String insuranceNumber;
    private String loanNumber;
    private Double loanBalance;
    private String loanType;

    public FinanceDTO() {
    }

    @Override
    public String toString() {
        return "FinanceDTO{" +
                "income=" + income +
                ", bankAccountType='" + bankAccountType + '\'' +
                ", shareHolding=" + shareHolding +
                ", insuranceCompany='" + insuranceCompany + '\'' +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ", loanNumber='" + loanNumber + '\'' +
                ", loanBalance=" + loanBalance +
                ", loanType='" + loanType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FinanceDTO that = (FinanceDTO) o;
        return Objects.equals(income, that.income) && Objects.equals(bankAccountType, that.bankAccountType) && Objects.equals(shareHolding, that.shareHolding) && Objects.equals(insuranceCompany, that.insuranceCompany) && Objects.equals(insuranceNumber, that.insuranceNumber) && Objects.equals(loanNumber, that.loanNumber) && Objects.equals(loanBalance, that.loanBalance) && Objects.equals(loanType, that.loanType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(income, bankAccountType, shareHolding, insuranceCompany, insuranceNumber, loanNumber, loanBalance, loanType);
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public Integer getShareHolding() {
        return shareHolding;
    }

    public void setShareHolding(Integer shareHolding) {
        this.shareHolding = shareHolding;
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

    public FinanceDTO(Integer income, String bankAccountType, Integer shareHolding, String insuranceCompany, String insuranceNumber, String loanNumber, Double loanBalance, String loanType) {
        this.income = income;
        this.bankAccountType = bankAccountType;
        this.shareHolding = shareHolding;
        this.insuranceCompany = insuranceCompany;
        this.insuranceNumber = insuranceNumber;
        this.loanNumber = loanNumber;
        this.loanBalance = loanBalance;
        this.loanType = loanType;
    }

    @Override
    public int compareTo(String o) {
        return this.bankAccountType.compareTo(o);
    }
}
