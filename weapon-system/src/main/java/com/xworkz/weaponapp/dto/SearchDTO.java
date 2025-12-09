package com.xworkz.weaponapp.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class SearchDTO implements Serializable {
    private String weaponName;
}
