package com.xworkz.weaponapp.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class WeaponDTO implements Serializable,Comparable<String> {

    private int weaponId;
    private String weaponName;
    private String weaponType;
    private String serialNumber;
    private String specification;
    private Double price;

    public WeaponDTO(String weaponName, String weaponType, String serialNumber, String specification, Double price) {
        this.weaponName=weaponName;
        this.weaponType=weaponType;
        this.serialNumber=serialNumber;
        this.specification =specification;
        this.price=price;
    }

    @Override
    public int compareTo(String o) {
        return this.weaponName.compareTo(o);
    }
}

