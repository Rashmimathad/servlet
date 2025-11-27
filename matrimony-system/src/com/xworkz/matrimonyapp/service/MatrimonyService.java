package com.xworkz.matrimonyapp.service;

import com.xworkz.matrimonyapp.exception.DataInvalidException;
import com.xworkz.matrimonyapp.dto.MatrimonyDto;

public interface MatrimonyService {
    void validateAndSave(MatrimonyDto matrimonyDto) throws DataInvalidException;
}
