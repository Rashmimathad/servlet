package com.xworkz.tables.street;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDeleteStreet {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();
            String deleteQueryById = "delete from street where street_id=53;";
            int rowsAffected = statement.executeUpdate(deleteQueryById);
            System.out.println("Rows Affected by deleteQueryById : "+rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
