package com.xworkz.coffee.service;

import com.xworkz.coffee.dto.CustomerFeedbackDto;

public interface CustomerFeedbackService {
    void validateAndSave(CustomerFeedbackDto customerFeedbackDto);
}
