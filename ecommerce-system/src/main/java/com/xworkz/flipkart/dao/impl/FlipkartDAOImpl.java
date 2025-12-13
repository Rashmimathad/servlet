package com.xworkz.flipkart.dao.impl;

import com.xworkz.flipkart.dao.FlipkartDAO;
import com.xworkz.flipkart.dto.FlipkartUserDTO;
import com.xworkz.flipkart.constants.DBConstants;
import com.xworkz.flipkart.dto.SearchDTO;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
    public void update(FlipkartUserDTO flipkartUserDTO) {
        String updateQuery = "update flipkart_users set user_name=?,user_contact_number=?,user_gender=?,user_age=?,user_address=? where user_contact_number=? and is_deleted=0;";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);){
            preparedStatement.setString(1, flipkartUserDTO.getFullName());
            preparedStatement.setLong(2,flipkartUserDTO.getContactNumber());
            preparedStatement.setString(3,flipkartUserDTO.getGender());
            preparedStatement.setInt(4,flipkartUserDTO.getAge());
            preparedStatement.setString(5,flipkartUserDTO.getAddress());
            preparedStatement.setLong(6,flipkartUserDTO.getContactNumber());

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows Updated : "+rowsAffected);
        }
    }

    @Override
    @SneakyThrows
    public void delete(int id) {
        String deleteQuery = "update flipkart_users set is_deleted = 1 where user_id=?;";
        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);){
            preparedStatement.setInt(1,id);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("User deleted");
            System.out.println("Rows Affected = "+rowsAffected);
        }
    }

    @Override
    @SneakyThrows
    public boolean contactNumberCheck(Long contactNumber) {
        String checkContactNumber = "select 1 from flipkart_users where user_contact_number=? and is_deleted=0;";
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
        String searchByContact = "SELECT * from flipkart_users where user_contact_number=? and is_deleted=0;";
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

    @Override
    @SneakyThrows
    public List<FlipkartUserDTO> findByLocation(SearchDTO searchDTO) {
        String searchByLocationQuery = "Select * from flipkart_users where user_address=? and is_deleted=0;";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(searchByLocationQuery);){
            preparedStatement.setString(1,searchDTO.getAddress());
            ResultSet resultSet = preparedStatement.executeQuery();

            List<FlipkartUserDTO> flipkartUserList = new ArrayList<>();
            while (resultSet.next()){
                int id = resultSet.getInt("user_id");
                String userName = resultSet.getString("user_name");
                Long contactNumber = resultSet.getLong("user_contact_number");
                String gender = resultSet.getString("user_gender");
                int age = resultSet.getInt("user_age");
                String address = resultSet.getString("user_address");

                FlipkartUserDTO flipkartUserDTO = new FlipkartUserDTO(id,userName,contactNumber,gender,age,address);
                System.out.println("Data found : "+flipkartUserDTO);
                flipkartUserList.add(flipkartUserDTO);
            }
            return flipkartUserList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
