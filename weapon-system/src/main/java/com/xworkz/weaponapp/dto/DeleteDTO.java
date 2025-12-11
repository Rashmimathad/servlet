package com.xworkz.weaponapp.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class DeleteDTO implements Serializable {

    private int weaponId;
}
