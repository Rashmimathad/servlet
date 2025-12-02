package com.xworkz.tables.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainUpdateHospital {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            String updateQueryById = "update hospital set hospital_type='Government'  where hospital_id=25;";
            String updateQueryByName = "update hospital set hospital_number_of_beds=500  where hospital_name='Metro Hospital';";
            String updateQueryByEstablishedYear = "update hospital set hospital_rating=4.5 where hospital_established_year < 2002;";
            String updateQueryByEmail = "update hospital set hospital_contact_number = 090-416696565 where hospital_email='gle64@hospital.com';";

            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(updateQueryById);
            int rowsAffected1 = statement.executeUpdate(updateQueryByName);
            int rowsAffected2 = statement.executeUpdate(updateQueryByEstablishedYear);
            int rowsAffected3 = statement.executeUpdate(updateQueryByEmail);
            System.out.println("Rows Affected by updateQueryById : "+rowsAffected);
            System.out.println("Rows Affected by updateQueryByName : "+rowsAffected1);
            System.out.println("Rows Affected by updateQueryByEstablishedYear : "+rowsAffected2);
            System.out.println("Rows Affected by updateQueryByEmail : "+rowsAffected3);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
