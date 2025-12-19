package com.xworkz.iplbiddingapp.repository.impl;

import com.xworkz.iplbiddingapp.constants.DBConstants;
import com.xworkz.iplbiddingapp.dto.BidPlayerDTO;
import com.xworkz.iplbiddingapp.dto.PlayerDTO;
import com.xworkz.iplbiddingapp.dto.SearchDTO;
import com.xworkz.iplbiddingapp.exceptions.DuplicatePlayerException;
import com.xworkz.iplbiddingapp.repository.BiddingRepository;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiddingRepositoryImpl implements BiddingRepository {

    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Override
    @SneakyThrows
    public boolean save(PlayerDTO playerDTO) {
        String insertQuery = "insert into player_info(player_name,player_age,player_state,player_type,player_batting_avg,player_bowling_avg,player_no_of_stumps) values (?,?,?,?,?,?,?);";
        boolean isSaved=false;
        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);){

            preparedStatement.setString(1, playerDTO.getPlayerName());
            preparedStatement.setInt(2,playerDTO.getAge());
            preparedStatement.setString(3,playerDTO.getState());
            preparedStatement.setString(4,playerDTO.getPlayerType());
            preparedStatement.setDouble(5,playerDTO.getBattingAvg());
            preparedStatement.setDouble(6,playerDTO.getBowlingAvg());
            preparedStatement.setInt(7,playerDTO.getNoOfStumps());

            int rowsAffected =preparedStatement.executeUpdate();
            if (rowsAffected>0){
                isSaved=true;
            }
        }

        return isSaved;
    }

    @Override
    @SneakyThrows
    public boolean checkDuplicateName(String playerName) {
        String duplicateCheck = "select 1 from player_info where player_name=?;";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(duplicateCheck);){

            preparedStatement.setString(1,playerName);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                return true;
            }
        }
        return false;
    }

    @Override
    @SneakyThrows
    public String getCompanyName(String email) {
        String getCompanyName = "select company_name from company_info where company_email=?;";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(getCompanyName);){
            preparedStatement.setString(1,email);

           ResultSet resultSet =  preparedStatement.executeQuery();
           if (resultSet.next()){
              return resultSet.getString("company_name");
           }else return "";
        }
    }

    @Override
    @SneakyThrows
    public List<PlayerDTO> findPlayers(SearchDTO searchDTO) {

        String searchQuery = "select * from player_info where player_type=? and player_batting_avg>=? and player_bowling_avg>=? and player_no_of_stumps>=?;";
        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(searchQuery);){

            preparedStatement.setString(1,searchDTO.getPlayerType());
            preparedStatement.setDouble(2,searchDTO.getBattingAvg());
            preparedStatement.setDouble(3,searchDTO.getBowlingAvg());
            preparedStatement.setInt(4,searchDTO.getNoOfStumps());

            ResultSet resultSet = preparedStatement.executeQuery();

              List<PlayerDTO> playerDTOList = new ArrayList<>();
            while (resultSet.next()){
                int id =  resultSet.getInt("player_id");
                String name =  resultSet.getString("player_name");
                int age =   resultSet.getInt("player_age");
                String state = resultSet.getString("player_state");
                String playerType = resultSet.getString("player_type");
                double battingAvg = resultSet.getDouble("player_batting_avg");
                double bowlingAvg = resultSet.getDouble("player_bowling_avg");
                int noOfStumps = resultSet.getInt("player_no_of_stumps");

                PlayerDTO playerDTO = new PlayerDTO(id,name,age,state,playerType,battingAvg,bowlingAvg,noOfStumps);
                playerDTOList.add(playerDTO);
            }
            return playerDTOList;
        }catch (Exception e) {
        e.printStackTrace();
    }

        return Collections.emptyList();
    }

    @Override
    @SneakyThrows
    public String getPlayerName(int id) {
        String playerNameQuery = "select player_name from player_info where player_id=?;";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(playerNameQuery);){

            preparedStatement.setInt(1,id);

            ResultSet resultSet =  preparedStatement.executeQuery();

            if (resultSet.next()){
                String playerName = resultSet.getString("player_name");
                return playerName;
            }else  return "";
        }
    }

    @Override
    @SneakyThrows
    public boolean bidPlayer(BidPlayerDTO bidPlayerDTO) {
        String bidInsertQuery = "insert into bid_table(player_name,bid_price,bid_company_name) values(?,?,?);";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(bidInsertQuery);){

            preparedStatement.setString(1,bidPlayerDTO.getName());
            preparedStatement.setDouble(2,bidPlayerDTO.getBidPrice());
            preparedStatement.setString(3,bidPlayerDTO.getCompanyName());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected>0)
                return true;
        }
        return false;
    }

    @Override
    public int findBidsPerPlayer(BidPlayerDTO bidPlayerDTO) {
        return 0;
    }
}
