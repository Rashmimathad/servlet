package com.xworkz.tables.president;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDeleteByConditionPresident {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();
            String deleteByCondition = "delete from president WHERE president_term_end_year < 2010;";

            int rowsAffected = statement.executeUpdate(deleteByCondition);

            System.out.println("Rows Affected by updateById : "+rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
