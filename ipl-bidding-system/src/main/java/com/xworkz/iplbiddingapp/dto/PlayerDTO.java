package com.xworkz.iplbiddingapp.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PlayerDTO {

    private int id;
    private String playerName;
    private int age;
    private String state;
    private String playerType;
    private double battingAvg;
    private double bowlingAvg;
    private  int noOfStumps;

    public PlayerDTO(String playerName, int age, String state, String playerType, double battingAvg, double bowlingAvg, int noOfStumps) {
        this.playerName = playerName;
        this.age = age;
        this.state = state;
        this.playerType = playerType;
        this.battingAvg = battingAvg;
        this.bowlingAvg = bowlingAvg;
        this.noOfStumps = noOfStumps;
    }



}
