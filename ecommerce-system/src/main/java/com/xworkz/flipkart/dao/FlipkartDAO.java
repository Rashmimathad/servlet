package com.xworkz.flipkart.dao;

import com.xworkz.flipkart.dto.FlipkartUserDTO;
import com.xworkz.flipkart.dto.SearchDTO;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


public interface FlipkartDAO {
    void save(FlipkartUserDTO flipkartUserDTO);
    void update(FlipkartUserDTO flipkartUserDTO);
    default boolean contactNumberCheck(Long contactNumber){
        return false;
    }
    default Optional<FlipkartUserDTO> findByContactNo(Long contactNo){
        return Optional.empty();
    }

    default List<FlipkartUserDTO> findByLocation(SearchDTO searchDTO){
        return Collections.emptyList();
    }
}
