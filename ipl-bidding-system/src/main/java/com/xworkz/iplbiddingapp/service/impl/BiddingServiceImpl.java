package com.xworkz.iplbiddingapp.service.impl;

import com.xworkz.iplbiddingapp.dto.BidPlayerDTO;
import com.xworkz.iplbiddingapp.dto.PlayerDTO;
import com.xworkz.iplbiddingapp.dto.SearchDTO;
import com.xworkz.iplbiddingapp.exceptions.DataInvalidException;
import com.xworkz.iplbiddingapp.exceptions.DuplicatePlayerException;
import com.xworkz.iplbiddingapp.repository.BiddingRepository;
import com.xworkz.iplbiddingapp.repository.impl.BiddingRepositoryImpl;
import com.xworkz.iplbiddingapp.service.BiddingService;

import java.util.Collections;
import java.util.List;

public class BiddingServiceImpl implements BiddingService {

    private BiddingRepository biddingRepository = new BiddingRepositoryImpl();

    @Override
    public boolean validateAndSave(PlayerDTO playerDTO) throws DataInvalidException, DuplicatePlayerException {

        if (playerDTO == null) {
            throw new DataInvalidException("Player data is null");
        }

        if (playerDTO.getPlayerName() == null ||
                playerDTO.getPlayerName().trim().isEmpty() ||
                playerDTO.getPlayerName().length() < 3) {

            throw new DataInvalidException(
                    "Player Name must not be empty and must have at least 3 characters"
            );
        }

        if (playerDTO.getAge() < 15 || playerDTO.getAge() > 60) {
            throw new DataInvalidException("Player Age must be between 15 and 60");
        }

        if (playerDTO.getState() == null ||
                playerDTO.getState().trim().isEmpty() ||
                playerDTO.getState().length() < 3) {

            throw new DataInvalidException(
                    "State Name must not be empty and must have at least 3 characters"
            );
        }

        if (playerDTO.getPlayerType() == null ||
                playerDTO.getPlayerType().trim().isEmpty()) {

            throw new DataInvalidException("Player Type is required");
        }

        switch (playerDTO.getPlayerType().trim().toUpperCase()) {

            case "BATTER":
                if (playerDTO.getBattingAvg() <= 0) {
                    throw new DataInvalidException("Batting Average must be greater than 0");
                }
                break;

            case "BOWLER":
                if (playerDTO.getBowlingAvg() <= 0) {
                    throw new DataInvalidException("Bowling Average must be greater than 0");
                }
                break;

            case "ALL ROUNDER":
                if (playerDTO.getBattingAvg() <= 0 ||
                        playerDTO.getBowlingAvg() <= 0) {

                    throw new DataInvalidException(
                            "Batting & Bowling Average must be greater than 0"
                    );
                }
                break;

            case "WICKET KEEPER":
                if (playerDTO.getBattingAvg() <= 0) {
                    throw new DataInvalidException("Batting Average must be greater than 0");
                }
                if (playerDTO.getNoOfStumps() <= 0 ||
                        playerDTO.getNoOfStumps() > 1000) {

                    throw new DataInvalidException(
                            "No of Stumps must be between 1 and 1000"
                    );
                }
                break;

            default:
                throw new DataInvalidException("Invalid Player Type");
        }
        boolean isDuplicate = biddingRepository.checkDuplicateName(playerDTO.getPlayerName());
        if (!isDuplicate) {
            boolean saved = biddingRepository.save(playerDTO);
            if (!saved) {
                throw new DataInvalidException("Failed to save player data");
            }
        }else{
            throw new DuplicatePlayerException("Player Already Exists");
        }

        return true;
    }

    @Override
    public String validateEmail(String email) throws DataInvalidException {
        String companyName = "";
        if (email==null||email.isEmpty()||!email.contains("@gmail.com")){
            throw new DataInvalidException("Email not found");
        }else{
           companyName =   biddingRepository.getCompanyName(email);
        }
        return companyName;
    }

    @Override
    public List<PlayerDTO> validateAndSearch(SearchDTO searchDTO) {
        if (searchDTO.getPlayerType() == null ||
                searchDTO.getPlayerType().trim().isEmpty()) {

            throw new DataInvalidException("Player Type is required");
        }

        switch (searchDTO.getPlayerType().trim().toUpperCase()) {

            case "BATTER":
                if (searchDTO.getBattingAvg() <= 0) {
                    throw new DataInvalidException("Batting Average must be greater than 0");
                }
                break;

            case "BOWLER":
                if (searchDTO.getBowlingAvg() <= 0) {
                    throw new DataInvalidException("Bowling Average must be greater than 0");
                }
                break;

            case "ALL ROUNDER":
                if (searchDTO.getBattingAvg() <= 0 ||
                        searchDTO.getBowlingAvg() <= 0) {

                    throw new DataInvalidException(
                            "Batting & Bowling Average must be greater than 0"
                    );
                }
                break;

            case "WICKET KEEPER":
                if (searchDTO.getBattingAvg() <= 0) {
                    throw new DataInvalidException("Batting Average must be greater than 0");
                }
                if (searchDTO.getNoOfStumps() <= 0 ||
                        searchDTO.getNoOfStumps() > 1000) {

                    throw new DataInvalidException(
                            "No of Stumps must be between 1 and 1000"
                    );
                }
                break;

            default:
                throw new DataInvalidException("Invalid Player Type");
        }

        List<PlayerDTO> searchList =  biddingRepository.findPlayers(searchDTO);
        if (searchList.iterator().hasNext()){
            return searchList;
        }else  return Collections.emptyList();
    }

    @Override
    public String bidPlayer(int id) {
       String playerName = biddingRepository.getPlayerName(id);
       if (playerName=="")
           throw new DataInvalidException("Player not found");
       else
           return playerName;
    }

    @Override
    public boolean validateAndBid(BidPlayerDTO bidPlayerDTO) {
        boolean isValidated = false;
        if (bidPlayerDTO.getName()==null||bidPlayerDTO.getName().isEmpty()){
            System.err.println("Invalid Name");
        } else if (bidPlayerDTO.getBidPrice()<=0.0) {
            System.err.println("Price must be greater than 0");
        }else if (bidPlayerDTO.getCompanyName()==null||bidPlayerDTO.getCompanyName().isEmpty()){
            System.err.println("Invalid Company Name");
        }else {
            isValidated = true;
        }
        if (isValidated){

            int countOfBid = biddingRepository.findBidsPerPlayer(bidPlayerDTO);
           boolean isBidDone = biddingRepository.bidPlayer(bidPlayerDTO);
           if (isBidDone)
               System.out.println("Bidding Done Successfully!!!");
           else
               System.err.println("Player not available to bid");
        }

        return isValidated;
    }


}
