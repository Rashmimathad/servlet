package com.xworkz.flipkart.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter

public class FlipkartUserDTO implements Serializable,Comparable<String> {
    private int id;
    private String fullName;
    private long contactNumber;
    private String gender;
    private int age;
    private String address;
    private String password;
    private String confirmPassword;

    public FlipkartUserDTO(String fullName, long contactNumber, String gender, int age, String address, String password, String confirmPassword) {
        this.id = id;
        this.fullName = fullName;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    @Override
    public int compareTo(String o) {
        return this.getFullName().compareTo(o);
    }
}
