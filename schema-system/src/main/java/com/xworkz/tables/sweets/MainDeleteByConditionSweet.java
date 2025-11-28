package com.xworkz.tables.sweets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDeleteByConditionSweet {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            String deleteQueryByCondition = "delete from sweet where sweet_shop_name='Cochin sweets';";
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(deleteQueryByCondition);
            System.out.println("Rows Affected by delete query by condition : "+rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
