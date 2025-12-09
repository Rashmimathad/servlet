package com.xworkz.weaponapp.exceptions;

public class DuplicateWeaponNameException extends RuntimeException {
    public DuplicateWeaponNameException(String message) {
        super(message);
    }
}
