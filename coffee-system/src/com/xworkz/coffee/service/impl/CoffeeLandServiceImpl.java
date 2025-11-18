package com.xworkz.coffee.service.impl;

import com.xworkz.coffee.dto.CoffeeLandDto;
import com.xworkz.coffee.service.CoffeeLandService;

public class CoffeeLandServiceImpl implements CoffeeLandService {
    @Override
    public void validateAndSave(CoffeeLandDto coffeeLandDto) {
        System.out.println("CoffeeLandDto valiadted and saved in CoffeeLand Service Impl");
        System.out.println("COffeeLandDto = "+coffeeLandDto);
    }
}
