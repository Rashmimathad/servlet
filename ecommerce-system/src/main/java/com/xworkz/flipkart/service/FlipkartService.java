package com.xworkz.flipkart.service;

import com.xworkz.flipkart.dto.FlipkartUserDTO;
import com.xworkz.flipkart.exceptions.DataInvalidException;

public interface FlipkartService {
    void validateAndSave(FlipkartUserDTO flipkartUserDTO) throws DataInvalidException;
}
