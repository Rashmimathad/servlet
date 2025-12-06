package com.xworkz.flipkart.dao;

import com.xworkz.flipkart.dto.FlipkartUserDTO;

import java.util.Optional;


public interface FlipkartDAO {
    void save(FlipkartUserDTO flipkartUserDTO);
    default boolean contactNumberCheck(Long contactNumber){
        return false;
    }
    default Optional<FlipkartUserDTO> findByContactNo(Long contactNo){
        return Optional.empty();
    }
}
