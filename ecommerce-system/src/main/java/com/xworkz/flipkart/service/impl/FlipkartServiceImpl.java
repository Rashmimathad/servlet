package com.xworkz.flipkart.service.impl;

import com.xworkz.flipkart.DAO.FlipkartDAO;
import com.xworkz.flipkart.DAO.impl.FlipkartDAOImpl;
import com.xworkz.flipkart.DTO.FlipkartUserDTO;
import com.xworkz.flipkart.exceptions.DataInvalidException;
import com.xworkz.flipkart.service.FlipkartService;

public class FlipkartServiceImpl implements FlipkartService {
    private final FlipkartDAO flipkartDAO = new FlipkartDAOImpl();
    @Override
    public void validateAndSave(FlipkartUserDTO flipkartUserDTO) throws DataInvalidException {
        boolean isUserValidated=false;

    }
}
