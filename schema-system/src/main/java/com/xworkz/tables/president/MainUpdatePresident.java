package com.xworkz.tables.president;

import java.sql.*;

public class MainUpdatePresident {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();
            String updateById = "UPDATE president SET president_approval_rating = 82 WHERE president_id = 5;";
            String updateByTermStartYear = "UPDATE president SET president_salary = president_salary + 500000 WHERE president_term_start_year >= 2000;";
            String updateByFullName = "UPDATE president SET president_political_party = 'Independent' WHERE president_full_name = 'Ram Nath Kovind';";
            String updateTermEndYearById = "UPDATE president SET president_term_end_year = president_term_end_year + 1 WHERE president_id BETWEEN 10 AND 20;";

            int rowsAffected = statement.executeUpdate(updateById);
            int rowsAffected1 = statement.executeUpdate(updateByTermStartYear);
            int rowsAffected2 = statement.executeUpdate(updateByFullName);
            int rowsAffected3 = statement.executeUpdate(updateTermEndYearById);
            System.out.println("Rows Affected by updateById : "+rowsAffected);
            System.out.println("Rows Affected by updateByTermStartYear : "+rowsAffected1);
            System.out.println("Rows Affected by updateByFullName : "+rowsAffected2);
            System.out.println("Rows Affected by updateTermEndYearById : "+rowsAffected3);


            } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
