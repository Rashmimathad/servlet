package com.xworkz.tables.sweets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainUpdateSweet {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            String updateQueryById = "update sweet set sweet_price=150.0 where sweet_id=27";
            String updateQueryByShopName = "update sweet set sweet_shop_name='New Kakinada sweets' where sweet_shop_name='Kakinada sweets';";
            String updateQueryByOriginPlace = "update sweet set sweet_shop_name='Bihar sweets' where sweet_origin_place='Bihar';";
            String updateQueryBySugarLevel = "update sweet set sweet_origin_place='Delhi' where sweet_sugar_level='Low';";

            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(updateQueryById);
            int rowsAffected1 = statement.executeUpdate(updateQueryByShopName);
            int rowsAffected2 = statement.executeUpdate(updateQueryByOriginPlace);
            int rowsAffected3 = statement.executeUpdate(updateQueryBySugarLevel);
            System.out.println("Rows Affected in updateQueryById : "+rowsAffected);
            System.out.println("Rows Affected in updateQueryByShopName : "+rowsAffected1);
            System.out.println("Rows Affected in updateQueryByOriginPlace : "+rowsAffected2);
            System.out.println("Rows Affected in updateQueryBySugarLevel : "+rowsAffected3);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
