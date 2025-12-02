package com.xworkz.matrimonyapp.service.impl;

import com.xworkz.matrimonyapp.DAO.MatrimonyDAO;
import com.xworkz.matrimonyapp.DAO.impl.MatrimonyDAOImpl;
import com.xworkz.matrimonyapp.exception.DataInvalidException;
import com.xworkz.matrimonyapp.dto.MatrimonyDto;
import com.xworkz.matrimonyapp.service.MatrimonyService;

public class MatrimonyServiceImpl implements MatrimonyService {
    private final MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
    @Override
    public void validateAndSave(MatrimonyDto matrimonyDto) throws DataInvalidException {
        boolean isInvalid = false;
        if (matrimonyDto.getEmail() == null || matrimonyDto.getEmail().isEmpty()) {
            System.err.println("invalid email");
            isInvalid = true;
        }
         if (matrimonyDto.getCreateProfileFor() == null || matrimonyDto.getCreateProfileFor().isEmpty()) {
            System.err.println("invalid profile for");
            isInvalid = true;
        }
         if (matrimonyDto.getGender() == null || matrimonyDto.getGender().isEmpty()) {
            System.err.println("invalid gender");
            isInvalid = true;
        }
         if (matrimonyDto.getDateOfBirth() == null) {
            System.err.println("invalid dob");
            isInvalid = true;
        }
         if (matrimonyDto.getMotherTongue() == null) {
            System.err.println("invalid motherTongue");
            isInvalid = true;
        }
         if (matrimonyDto.getReligion() == null) {
            System.err.println("invalid religion");
            isInvalid = true;
        }
         if (matrimonyDto.getMaritalStatus() == null) {
            System.err.println("invalid maritalStatus");
            isInvalid = true;
        }
         if (matrimonyDto.getHeight() < 1 || matrimonyDto.getHeight() > 7) {
            System.err.println("invalid height");
            isInvalid = true;
        }

       if (isInvalid){
           throw new DataInvalidException("Data not saved successfully!!");
       }
       else{
           matrimonyDAO.save(matrimonyDto);
       }
    }
}
