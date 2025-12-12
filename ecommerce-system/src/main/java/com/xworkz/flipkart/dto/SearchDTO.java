package com.xworkz.flipkart.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class SearchDTO implements Serializable {
    private Long contactNo;
    private String address;

    public SearchDTO(String address) {
        this.address=address;
    }

    public SearchDTO(Long contactNo) {
        this.contactNo=contactNo;
    }
}
