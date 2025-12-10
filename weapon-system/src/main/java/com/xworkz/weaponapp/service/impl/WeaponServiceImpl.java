package com.xworkz.weaponapp.service.impl;

import com.xworkz.weaponapp.dto.SearchByTypeDTO;
import com.xworkz.weaponapp.dto.SearchDTO;
import com.xworkz.weaponapp.dto.WeaponDTO;
import com.xworkz.weaponapp.exceptions.DataInvalidException;
import com.xworkz.weaponapp.exceptions.DuplicateWeaponNameException;
import com.xworkz.weaponapp.repository.WeaponRepository;
import com.xworkz.weaponapp.repository.impl.WeaponRepositoryImpl;
import com.xworkz.weaponapp.service.WeaponService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class WeaponServiceImpl implements WeaponService {


    private final WeaponRepository weaponRepository = new WeaponRepositoryImpl();

    @Override
    public void validateAndSave(WeaponDTO weaponDTO) throws DataInvalidException {
        boolean isDataValidated=false;
        if (weaponDTO.getWeaponName()==null||weaponDTO.getWeaponName().isEmpty()){
            System.err.println("Invalid weapon name");
        }else if (weaponDTO.getWeaponType()==null||weaponDTO.getWeaponType().isEmpty()){
            System.err.println("Invalid weapon type");
        } else if (weaponDTO.getSerialNumber()==null||weaponDTO.getSerialNumber().isEmpty()) {
            System.err.println("Invalid serial Number");
        } else if (weaponDTO.getSpecification()==null||weaponDTO.getSpecification().isEmpty()) {
            System.err.println("Invalid weapon specifications");
        } else if (weaponDTO.getPrice()<0.0) {
            System.err.println("Invalid Price");
        }else{
            isDataValidated=true;
        }
        if (isDataValidated) {
            System.out.println("Data Validated");
            boolean isDuplicateName = weaponRepository.checkDuplicateWeaponName(weaponDTO.getWeaponName());
            if (!isDuplicateName) {
                weaponRepository.save(weaponDTO);
                System.out.println("Data Saved Successfully!!!");
                System.out.println("Weapon DTO : " + weaponDTO);
            }else{
                throw new DuplicateWeaponNameException("Weapon Already Exists");
            }
        } else {
            System.out.println("Data not validated");
            throw new DataInvalidException("Data not saved successfully!!");
        }
    }

    @Override
    public Optional<WeaponDTO> validateName(SearchDTO searchDTO) {
        if (searchDTO.getWeaponName()==null||searchDTO.getWeaponName().isEmpty()){
            System.err.println("Invalid Weapon Name");
            return Optional.empty();
        }
        System.out.println("name validated for search");
        return weaponRepository.findByWeaponName(searchDTO.getWeaponName());
    }

    @Override
    public List<WeaponDTO> validateWeaponType(SearchByTypeDTO searchByTypeDTO) {
        if (searchByTypeDTO.getWeaponType()==null|| searchByTypeDTO.getWeaponType().isEmpty()){
            System.err.println("Invalid weapon type");
            return Collections.emptyList();
        }

        System.out.println("Weapon Type validated");
        return weaponRepository.findWeaponByType(searchByTypeDTO.getWeaponType());
    }

}
