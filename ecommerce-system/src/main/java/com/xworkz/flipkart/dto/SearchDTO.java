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
}
