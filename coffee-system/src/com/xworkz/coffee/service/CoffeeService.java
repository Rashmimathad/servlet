package com.xworkz.coffee.service;
import com.xworkz.coffee.dto.CoffeeDto;

public interface CoffeeService {
   void validateAndSave(CoffeeDto coffeeDto);
}
