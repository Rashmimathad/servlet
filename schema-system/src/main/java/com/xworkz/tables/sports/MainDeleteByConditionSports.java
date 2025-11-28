package com.xworkz.tables.sports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDeleteByConditionSports {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            String deleteQueryBySportPopularityLevel = "delete from sports where sport_popularity_level='Low';";
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(deleteQueryBySportPopularityLevel);
            System.out.println("Rows Affected for deleteQueryBySportPopularityLevel : "+rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
