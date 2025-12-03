package com.xworkz.flipkart.service;

import com.xworkz.flipkart.DTO.FlipkartUserDTO;
import com.xworkz.flipkart.exceptions.DataInvalidException;

public interface FlipkartService {
    void validateAndSave(FlipkartUserDTO flipkartUserDTO) throws DataInvalidException;
}
