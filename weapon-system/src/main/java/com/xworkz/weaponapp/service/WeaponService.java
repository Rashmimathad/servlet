package com.xworkz.weaponapp.service;

import com.xworkz.weaponapp.dto.SearchByTypeDTO;
import com.xworkz.weaponapp.dto.SearchDTO;
import com.xworkz.weaponapp.dto.WeaponDTO;
import com.xworkz.weaponapp.exceptions.DataInvalidException;

import java.util.List;
import java.util.Optional;

public interface WeaponService {
        void validateAndSave(WeaponDTO weaponDTO) throws DataInvalidException;
        Optional<WeaponDTO> validateName(SearchDTO searchDTO);
        List<WeaponDTO> validateWeaponType(SearchByTypeDTO searchByTypeDTO);
}
