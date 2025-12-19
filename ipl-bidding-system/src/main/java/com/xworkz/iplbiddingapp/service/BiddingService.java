package com.xworkz.iplbiddingapp.service;

import com.xworkz.iplbiddingapp.dto.BidPlayerDTO;
import com.xworkz.iplbiddingapp.dto.PlayerDTO;
import com.xworkz.iplbiddingapp.dto.SearchDTO;
import com.xworkz.iplbiddingapp.exceptions.DataInvalidException;
import com.xworkz.iplbiddingapp.exceptions.DuplicatePlayerException;

import java.util.List;

public interface BiddingService {
    boolean validateAndSave(PlayerDTO playerDTO) throws DataInvalidException, DuplicatePlayerException;
    String validateEmail(String email) throws DataInvalidException;

    List<PlayerDTO> validateAndSearch(SearchDTO searchDTO);


    String bidPlayer(int id);

    boolean validateAndBid(BidPlayerDTO bidPlayerDTO);
}
