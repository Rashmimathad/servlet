package com.xworkz.matrimonyapp.DAO.impl;

import com.xworkz.matrimonyapp.DAO.MatrimonyDAO;
import com.xworkz.matrimonyapp.constants.DBConstants;
import com.xworkz.matrimonyapp.dto.MatrimonyDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MatrimonyDAOImpl implements MatrimonyDAO {

    @Override
    public void save(MatrimonyDto matrimonyDto) {
        String insertQuery = "insert into matrimony(email, createProfileFor, gender, dateOfBirth, motherTongue, religion, maritalStatus, height) values(?,?,?,?,?,?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try( Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);){


            preparedStatement.setString(1,matrimonyDto.getEmail());
            preparedStatement.setString(2,matrimonyDto.getCreateProfileFor());
            preparedStatement.setString(3,matrimonyDto.getGender());
            preparedStatement.setDate(4,java.sql.Date.valueOf(matrimonyDto.getDateOfBirth()));
            preparedStatement.setString(5, matrimonyDto.getMotherTongue());
            preparedStatement.setString(6,matrimonyDto.getReligion());
            preparedStatement.setString(7,matrimonyDto.getMaritalStatus());
            preparedStatement.setInt(8,matrimonyDto.getHeight());

            int rows = preparedStatement.executeUpdate();
            System.out.println("Rows updated : "+rows);
        preparedStatement.close();
        connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
