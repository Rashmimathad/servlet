package com.xworkz.weaponapp.dto;

import lombok.Data;

@Data
public class SearchByTypeDTO {
    private String weaponType;
    public SearchByTypeDTO(String weaponType) {
        this.weaponType=weaponType;
    }
}
