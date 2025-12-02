package com.xworkz.tables.president;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDeletePresident {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();
            String deleteById = "delete from president WHERE president_id = 15;";

            int rowsAffected = statement.executeUpdate(deleteById);

            System.out.println("Rows Affected by updateById : "+rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
