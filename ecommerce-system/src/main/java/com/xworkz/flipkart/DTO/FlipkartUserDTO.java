package com.xworkz.flipkart.DTO;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter

public class FlipkartUserDTO implements Serializable,Comparable<String> {
    private String fullName;
    private long contactNumber;
    private String gender;
    private int age;
    private String address;

    @Override
    public int compareTo(String o) {
        return this.getFullName().compareTo(o);
    }
}
