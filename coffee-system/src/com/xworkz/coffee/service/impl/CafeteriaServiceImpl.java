package com.xworkz.coffee.service.impl;

import com.xworkz.coffee.dto.CafeteriaDto;
import com.xworkz.coffee.service.CafeteriaService;

public class CafeteriaServiceImpl implements CafeteriaService {
    @Override
    public void validateAndSave(CafeteriaDto cafeteriaDto) {
        System.out.println("CafeteriaDto validated and saved in CafeteriaService Impl");
        System.out.println("CafeteriaDto = "+cafeteriaDto);
    }
}
