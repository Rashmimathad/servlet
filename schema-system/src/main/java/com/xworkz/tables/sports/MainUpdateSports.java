package com.xworkz.tables.sports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainUpdateSports {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            String updateQueryById = "update sports set sport_play_area='Chess Board' where sport_id=33;";
            String updateQueryByName = "update sports set sport_play_area='Snooker Board' where sport_name='Snooker';";
            String updateQueryByNoOfPlayersInTeam = "update sports set no_of_players_in_team=2 where no_of_players_in_team=1;";
            String updateQueryBySportAgeGroup = "update sports set sport_popularity_level='Low' where sport_age_group='Kids';";

            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(updateQueryById);
            int rowsAffected1 = statement.executeUpdate(updateQueryByName);
            int rowsAffected2 = statement.executeUpdate(updateQueryByNoOfPlayersInTeam);
            int rowsAffected3 = statement.executeUpdate(updateQueryBySportAgeGroup);
            System.out.println("Rows Affected by updateQueryById : "+rowsAffected);
            System.out.println("Rows Affected by updateQueryByName : "+rowsAffected1);
            System.out.println("Rows Affected by updateQueryByNoOfPlayersInTeam : "+rowsAffected2);
            System.out.println("Rows Affected by updateQueryBySportAgeGroup : "+rowsAffected3);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
