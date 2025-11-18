package com.xworkz.coffee.service.impl;

import com.xworkz.coffee.dto.CustomerDto;
import com.xworkz.coffee.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void validateAndSave(CustomerDto customerDto) {
        System.out.println("CustomerDto validated and saved in Customer Service Impl");
        System.out.println("CustomerDto = "+customerDto);
    }
}
