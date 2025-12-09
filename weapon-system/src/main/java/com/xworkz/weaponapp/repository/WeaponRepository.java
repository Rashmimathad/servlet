package com.xworkz.weaponapp.repository;

import com.xworkz.weaponapp.dto.WeaponDTO;

import java.util.Optional;

public interface WeaponRepository {

    void save(WeaponDTO weaponDTO);
    default boolean checkDuplicateWeaponName(String weaponName){
        return false;
    }
    default Optional<WeaponDTO> findByWeaponName(String weaponName){
        return Optional.empty();
    }
}
