package com.xworkz.tables.street;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainUpdateStreet {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            String updateQueryById = "update street set no_of_houses_in_street=100 where street_id=2;";
            String updateQueryByStreetName = "update street set no_of_shops_in_street=80 where street_name='BTM Main Road';";
            String updateQueryById1 = "update street set pincode = 700091 where street_id=16";
            String updateQueryByDistrict = "update street set district='Bengal' where pincode=700091;";
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(updateQueryById);
            int rowsAffected1 = statement.executeUpdate(updateQueryByStreetName);
            int rowsAffected2 = statement.executeUpdate(updateQueryById1);
            int rowsAffected3 = statement.executeUpdate(updateQueryByDistrict);
            System.out.println("Rows Affected by updateQueryById : "+rowsAffected);
            System.out.println("Rows Affected by updateQueryByStreetName : "+rowsAffected1);
            System.out.println("Rows Affected by updateQueryById1 : "+rowsAffected2);
            System.out.println("Rows Affected by updateQueryByDistrict : "+rowsAffected3);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
