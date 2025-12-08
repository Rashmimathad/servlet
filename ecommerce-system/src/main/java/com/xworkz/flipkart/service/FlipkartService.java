package com.xworkz.flipkart.service;

import com.xworkz.flipkart.dto.FlipkartUserDTO;
import com.xworkz.flipkart.dto.SearchDTO;
import com.xworkz.flipkart.exceptions.DataInvalidException;

import java.util.Optional;

public interface FlipkartService {
    void validateAndSave(FlipkartUserDTO flipkartUserDTO) throws DataInvalidException;
    Optional<FlipkartUserDTO> validateContactNumber(SearchDTO searchDTO);
}
