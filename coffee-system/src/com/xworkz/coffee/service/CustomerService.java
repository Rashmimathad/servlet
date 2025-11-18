package com.xworkz.coffee.service;

import com.xworkz.coffee.dto.CustomerDto;

public interface CustomerService {
    void validateAndSave(CustomerDto customerDto);
}
