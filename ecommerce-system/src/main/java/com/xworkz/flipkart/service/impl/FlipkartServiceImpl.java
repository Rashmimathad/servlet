package com.xworkz.flipkart.service.impl;

import com.xworkz.flipkart.dao.FlipkartDAO;
import com.xworkz.flipkart.dao.impl.FlipkartDAOImpl;
import com.xworkz.flipkart.dto.FlipkartUserDTO;
import com.xworkz.flipkart.dto.SearchDTO;
import com.xworkz.flipkart.exceptions.ContactNumberDuplicateException;
import com.xworkz.flipkart.exceptions.DataInvalidException;
import com.xworkz.flipkart.service.FlipkartService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FlipkartServiceImpl implements FlipkartService {
    private final FlipkartDAO flipkartDAO = new FlipkartDAOImpl();
    @Override
    public void validateAndSave(FlipkartUserDTO flipkartUserDTO) throws DataInvalidException {
        boolean isUserValidated=false;
        if (flipkartUserDTO.getFullName()==null||flipkartUserDTO.getFullName().isEmpty()){
            System.err.println("Invalid name");
        }else if (flipkartUserDTO.getContactNumber()==0){
            System.err.println("Invalid contact number");
        } else if (flipkartUserDTO.getGender()==null||flipkartUserDTO.getGender().isEmpty()) {
            System.err.println("Invalid Gender");
        } else if (flipkartUserDTO.getAge()==0||flipkartUserDTO.getAge()<18) {
            System.err.println("Invalid Age");
        } else if (flipkartUserDTO.getAddress()==null||flipkartUserDTO.getAddress().isEmpty()) {
            System.err.println("Invalid Address");
        } else if (flipkartUserDTO.getPassword()==null||flipkartUserDTO.getPassword().isEmpty()) {
            System.err.println("Invalid Password");
        } else if (flipkartUserDTO.getConfirmPassword()==null||flipkartUserDTO.getConfirmPassword().isEmpty()) {
            System.err.println("Invalid Confirm Password");
        } else{
            isUserValidated=true;
        }
        if (isUserValidated){
            boolean checkContactNumber = flipkartDAO.contactNumberCheck(flipkartUserDTO.getContactNumber());
            if (!checkContactNumber) {
                flipkartDAO.save(flipkartUserDTO);
                System.out.println("Data Saved Successfully!!");
                System.out.println("FlipkartUserDTO = " + flipkartUserDTO);
            }else
                throw new ContactNumberDuplicateException("Contact Number already Exists");

        }else {
            throw new DataInvalidException("Data not validated!!!");
        }
    }

    @Override
    public void validateAndUpdate(FlipkartUserDTO flipkartUserDTO) throws DataInvalidException {
        boolean isUserValidated=false;
        if (flipkartUserDTO.getFullName()==null||flipkartUserDTO.getFullName().isEmpty()){
            System.err.println("Invalid name");
        }else if (flipkartUserDTO.getContactNumber()==0){
            System.err.println("Invalid contact number");
        } else if (flipkartUserDTO.getGender()==null||flipkartUserDTO.getGender().isEmpty()) {
            System.err.println("Invalid Gender");
        } else if (flipkartUserDTO.getAge()==0||flipkartUserDTO.getAge()<18) {
            System.err.println("Invalid Age");
        } else if (flipkartUserDTO.getAddress()==null||flipkartUserDTO.getAddress().isEmpty()) {
            System.err.println("Invalid Address");
        }else{
            isUserValidated=true;
        }
        if (isUserValidated){
                flipkartDAO.update(flipkartUserDTO);
                System.out.println("Data Saved Successfully!!");
                System.out.println("FlipkartUserDTO = " + flipkartUserDTO);
            }else {
            throw new DataInvalidException("Data not validated!!!");
        }
    }

    @Override
    public void validateAndDelete(int id) throws DataInvalidException {
        if (id>0){
            System.out.println("ID Validated");
            flipkartDAO.delete(id);
        }else {
            System.err.println("ID not validated");
            throw new DataInvalidException("ID not found");
        }
    }

    @Override
    public Optional<FlipkartUserDTO> validateContactNumber(SearchDTO searchDTO) {
        if (searchDTO.getContactNo()<=0) {
            System.err.println("Invalid contact number");
            return Optional.empty();
        }
        System.out.println("Data validated");
        return flipkartDAO.findByContactNo(searchDTO.getContactNo());
    }


    @Override
    public List<FlipkartUserDTO> validateLocation(SearchDTO searchDTO) {
        if (searchDTO.getAddress()==null||searchDTO.getAddress().isEmpty()) {
            System.err.println("Invalid address");
            return Collections.emptyList();
        }
        System.out.println("Data validated");
        return flipkartDAO.findByLocation(searchDTO);
    }
}
