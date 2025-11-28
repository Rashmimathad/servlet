package com.xworkz.tables.sweets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDeleteSweet {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            String deleteQuery = "delete from sweet where sweet_id = 21";
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(deleteQuery);
            System.out.println("Rows affected by deleteQuery : "+rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
