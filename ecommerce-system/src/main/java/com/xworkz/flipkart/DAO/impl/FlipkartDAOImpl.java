package com.xworkz.flipkart.DAO.impl;

import com.xworkz.flipkart.DAO.FlipkartDAO;
import com.xworkz.flipkart.DTO.FlipkartUserDTO;
import com.xworkz.flipkart.constants.DBConstants;
import com.xworkz.flipkart.exceptions.ContactNumberDuplicateException;
import java.sql.*;

public class FlipkartDAOImpl implements FlipkartDAO {
    @Override
    public void save(FlipkartUserDTO flipkartUserDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String insertQuery = "insert into flipkart_users(user_name,user_contact_number,user_gender,user_age,user_address) values (?,?,?,?,?);";
        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
            PreparedStatement preparedStatement= connection.prepareStatement(insertQuery);){
            preparedStatement.setString(1,flipkartUserDTO.getFullName());
            preparedStatement.setLong(2,flipkartUserDTO.getContactNumber());
            preparedStatement.setString(3,flipkartUserDTO.getGender());
            preparedStatement.setInt(4,flipkartUserDTO.getAge());
            preparedStatement.setString(5,flipkartUserDTO.getAddress());


            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows Affected : "+rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean contactNumberCheck(Long contactNumber) {
        String checkContactNumber = "select 1 from flipkart_users where user_contact_number=?;";
        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(checkContactNumber);){
         preparedStatement.setLong(1,contactNumber);
         ResultSet resultSet = preparedStatement.executeQuery();
         if (resultSet.next()){
             return true;
         }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
