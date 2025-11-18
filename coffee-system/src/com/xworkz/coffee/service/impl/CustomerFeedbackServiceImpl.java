package com.xworkz.coffee.service.impl;

import com.xworkz.coffee.dto.CustomerFeedbackDto;
import com.xworkz.coffee.service.CustomerFeedbackService;

public class CustomerFeedbackServiceImpl implements CustomerFeedbackService {
    @Override
    public void validateAndSave(CustomerFeedbackDto customerFeedbackDto) {
        System.out.println("CustomerFeedbackDto validated and saved in CustomerFeedback service Impl");
        System.out.println("CustomerFeedbackDto = "+customerFeedbackDto);
    }
}
