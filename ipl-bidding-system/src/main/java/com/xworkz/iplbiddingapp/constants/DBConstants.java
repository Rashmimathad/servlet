package com.xworkz.iplbiddingapp.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DBConstants {

    DB("jdbc:mysql://localhost:3306/iplbiddingschema","root","Root@1102");

    private String url;
    private String userName;
    private String password;
}
