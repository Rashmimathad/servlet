package com.xworkz.surveyapp.service;

import com.xworkz.surveyapp.dto.SurveyDto;
import com.xworkz.surveyapp.exceptions.DataInvalidException;

public interface SurveyService {
    void validateAndSave(SurveyDto surveyDto) throws DataInvalidException;
}
