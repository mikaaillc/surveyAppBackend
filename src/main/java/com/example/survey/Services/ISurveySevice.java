package com.example.survey.Services;

import com.example.survey.Entities.SurveyEntity;

import java.util.List;
import java.util.Optional;


public interface ISurveySevice {

    List<SurveyEntity> getAllSurvey();

    Optional<SurveyEntity> getSurveyBySurveyId(Long surveyId);

    Boolean saveSurvey(SurveyEntity survey);


}
