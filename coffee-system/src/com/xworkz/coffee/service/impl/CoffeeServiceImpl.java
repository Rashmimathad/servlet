package com.xworkz.coffee.service.impl;

import com.xworkz.coffee.dto.CoffeeDto;
import com.xworkz.coffee.service.CoffeeService;

public class CoffeeServiceImpl implements CoffeeService {
    @Override
    public void validateAndSave(CoffeeDto coffeeDto) {
        System.out.println("Coffee Dto validated and saved in coffee Service impl");
        System.out.println("CoffeeDto = "+coffeeDto);
    }
}
