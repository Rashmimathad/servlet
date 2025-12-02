package com.xworkz.tables.street;

import java.sql.*;

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
            String updateQueryByDistrict = "update street set district='Bengaluru' where pincode=560001;";

//            String updateQuery = "update street set no_of_houses_in_street=? where street_id=?;";
//            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
//            preparedStatement.setInt(1,90);
//            preparedStatement.setInt(2,9);
//            int rows = preparedStatement.executeUpdate();
//            System.out.println("Rows Updated : "+rows);
//
//            preparedStatement.setInt(1,100);
//            preparedStatement.setInt(2,20);
//            int rows1 = preparedStatement.executeUpdate();
//            System.out.println("Rows1 updated : "+rows1);
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
