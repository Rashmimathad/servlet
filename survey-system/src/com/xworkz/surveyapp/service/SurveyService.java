package com.xworkz.surveyapp.service;

import com.xworkz.surveyapp.dto.SurveyDTO;
import com.xworkz.surveyapp.exceptions.DataInvalidException;

public interface SurveyService {
    void validateAndSave(SurveyDTO surveyDto) throws DataInvalidException;
}
