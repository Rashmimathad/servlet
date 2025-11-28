package com.xworkz.tables.sports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDeleteSports {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            String deleteQueryById = "delete from sports where sport_id=70;";
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(deleteQueryById);
            System.out.println("Rows Affected for deleteQueryById : "+rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
