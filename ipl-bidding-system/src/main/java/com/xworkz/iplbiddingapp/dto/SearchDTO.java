package com.xworkz.iplbiddingapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class SearchDTO {

    private String playerType;
    private double battingAvg;
    private double bowlingAvg;
    private int noOfStumps;
}
