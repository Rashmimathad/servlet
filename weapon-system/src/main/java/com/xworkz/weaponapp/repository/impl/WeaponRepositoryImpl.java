package com.xworkz.weaponapp.repository.impl;

import com.xworkz.weaponapp.constant.DBConstants;
import com.xworkz.weaponapp.dto.WeaponDTO;
import com.xworkz.weaponapp.repository.WeaponRepository;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

public class WeaponRepositoryImpl implements WeaponRepository {

    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    @SneakyThrows
    public void save(WeaponDTO weaponDTO) {
        String insertQuery = " insert into weapons(weapon_name,weapon_type,serial_number,weapon_specification,weapon_price) values (?,?,?,?,?);";
        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);){
            preparedStatement.setString(1, weaponDTO.getWeaponName());
            preparedStatement.setString(2, weaponDTO.getWeaponType());
            preparedStatement.setString(3,weaponDTO.getSerialNumber());
            preparedStatement.setString(4, weaponDTO.getSpecification());
            preparedStatement.setDouble(5,weaponDTO.getPrice());
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows Affected : " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean checkDuplicateWeaponName(String weaponName) {
      String duplicateCheck = "select 1 from weapons where weapon_name=?;";
      try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
      PreparedStatement preparedStatement = connection.prepareStatement(duplicateCheck);){
          preparedStatement.setString(1,weaponName);
          ResultSet resultSet = preparedStatement.executeQuery();
          if (resultSet.next()){
              return true;
          }
      } catch (Exception e) {
          e.printStackTrace();
      }
      return false;
    }

    @Override
    public Optional<WeaponDTO> findByWeaponName(String weaponName) {
        String searchQuery = "select * from weapons where weapon_name=?;";
        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement(searchQuery);){
            preparedStatement.setString(1,weaponName);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                int id = resultSet.getInt("weapon_id");
                String name = resultSet.getString("weapon_name");
                String type = resultSet.getString("weapon_type");
                String serialNo = resultSet.getString("serial_number");
                String specification = resultSet.getString("weapon_specification");
                double price = resultSet.getDouble("weapon_price");

                WeaponDTO weaponDTO = new WeaponDTO(id,name,type,serialNo,specification,price);

                System.out.println("Weapon DTO present : "+Optional.of(weaponDTO).isPresent());
                return Optional.of(weaponDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
