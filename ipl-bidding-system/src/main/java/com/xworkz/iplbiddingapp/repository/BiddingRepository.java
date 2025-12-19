package com.xworkz.iplbiddingapp.repository;

import com.xworkz.iplbiddingapp.dto.BidPlayerDTO;
import com.xworkz.iplbiddingapp.dto.PlayerDTO;
import com.xworkz.iplbiddingapp.dto.SearchDTO;

import java.util.List;

public interface BiddingRepository {
    boolean save(PlayerDTO playerDTO);
    boolean checkDuplicateName(String playerName);
    String getCompanyName(String email);

    List<PlayerDTO> findPlayers(SearchDTO searchDTO);

    String getPlayerName(int id);

    boolean bidPlayer(BidPlayerDTO bidPlayerDTO);

    int findBidsPerPlayer(BidPlayerDTO bidPlayerDTO);
}
