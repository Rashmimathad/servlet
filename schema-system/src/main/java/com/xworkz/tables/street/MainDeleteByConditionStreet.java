package com.xworkz.tables.street;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDeleteByConditionStreet {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();
            String deleteQueryByCondition = "delete from street where district='Gurugram';";
            int rowsAffected = statement.executeUpdate(deleteQueryByCondition);
            System.out.println("Rows Affected by deleteQueryByCondition : "+rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
