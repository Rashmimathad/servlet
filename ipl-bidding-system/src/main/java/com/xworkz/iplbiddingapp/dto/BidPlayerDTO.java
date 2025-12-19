package com.xworkz.iplbiddingapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BidPlayerDTO {

    private String name;
    private double bidPrice;
    private String companyName;
}
