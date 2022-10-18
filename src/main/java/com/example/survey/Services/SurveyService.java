package com.example.survey.Services;

import com.example.survey.Entities.SurveyEntity;
import com.example.survey.Repos.SurveyRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService implements ISurveySevice {

    private final SurveyRepo surveyRepo;

    public SurveyService(SurveyRepo surveyRepo) {
        this.surveyRepo = surveyRepo;
    }

    @Override
    public List<SurveyEntity> getAllSurvey() {
        return surveyRepo.findAll();
    }

    @Override
    public Optional<SurveyEntity> getSurveyBySurveyId(Long surveyId) {
        return surveyRepo.findById(surveyId);
    }

    @Override
    public Boolean saveSurvey(SurveyEntity survey) {
        try {
            surveyRepo.saveAndFlush(survey);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
