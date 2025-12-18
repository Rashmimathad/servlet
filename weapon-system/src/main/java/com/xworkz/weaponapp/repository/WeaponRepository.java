package com.xworkz.weaponapp.repository;

import com.xworkz.weaponapp.dto.DeleteDTO;
import com.xworkz.weaponapp.dto.WeaponDTO;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface WeaponRepository {

    void save(WeaponDTO weaponDTO);
    void update(WeaponDTO weaponDTO);
    void delete(DeleteDTO deleteDTO);
    default boolean checkDuplicateWeaponName(String weaponName){
        return false;
    }
    default Optional<WeaponDTO> findByWeaponName(String weaponName){
        return Optional.empty();
    }
    default List<WeaponDTO> findWeaponByType(String weaponType){
        return Collections.emptyList();
    }
    List<String> enableDeletedData(WeaponDTO weaponDTO);
}
