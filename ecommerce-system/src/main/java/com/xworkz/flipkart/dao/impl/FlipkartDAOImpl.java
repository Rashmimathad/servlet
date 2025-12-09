package com.xworkz.flipkart.dao.impl;

import com.xworkz.flipkart.dao.FlipkartDAO;
import com.xworkz.flipkart.dto.FlipkartUserDTO;
import com.xworkz.flipkart.constants.DBConstants;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.Optional;

public class FlipkartDAOImpl implements FlipkartDAO {
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void save(FlipkartUserDTO flipkartUserDTO) {
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
    @SneakyThrows
    public boolean contactNumberCheck(Long contactNumber) {
        String checkContactNumber = "select 1 from flipkart_users where user_contact_number=?;";
        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(checkContactNumber);){
         preparedStatement.setLong(1,contactNumber);
         ResultSet resultSet = preparedStatement.executeQuery();
         if (resultSet.next()){
             return true;
         }
        }
        return false;
    }

    @Override
    @SneakyThrows
    public Optional<FlipkartUserDTO> findByContactNo(Long contactNo) {
        String searchByContact = "SELECT * from flipkart_users where user_contact_number=?;";
        try(Connection connection=DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(searchByContact);) {
            preparedStatement.setLong(1,contactNo);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                int id = resultSet.getInt("user_id");
                String fullName = resultSet.getString("user_name");
                long contactNumber = resultSet.getLong("user_contact_number");
                String gender = resultSet.getString("user_gender");
                int age = resultSet.getInt("user_age");
                String address = resultSet.getString("user_address");
                FlipkartUserDTO flipkartUserDTO = new FlipkartUserDTO(id,fullName,contactNumber,gender,age,address);
                System.out.println("User details found");
                System.out.println("Is flipkart user DTO present : "+Optional.of(flipkartUserDTO).get());
                return Optional.of(flipkartUserDTO);
            }
        }
        return Optional.empty();
    }
}
