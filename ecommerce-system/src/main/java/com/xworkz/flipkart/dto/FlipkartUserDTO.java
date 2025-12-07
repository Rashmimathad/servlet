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

    public FlipkartUserDTO(String fullName, long contactNumber, String gender, int age, String address) {
        this.fullName=fullName;
        this.contactNumber=contactNumber;
        this.gender=gender;
        this.age=age;
        this.address=address;
    }

    @Override
    public int compareTo(String o) {
        return this.getFullName().compareTo(o);
    }
}
