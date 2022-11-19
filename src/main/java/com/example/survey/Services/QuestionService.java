package com.example.survey.Services;

import com.example.survey.Entities.QuestionEntity;
import com.example.survey.Repos.QuestionRepo;
import com.example.survey.dto.QuestionModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService implements IQuestionService{

    public QuestionRepo questionRepo;

    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @Override
    public Optional<QuestionEntity> getQuestionById(Long questionId) {
        return questionRepo.findById(questionId);
    }

    @Override
    public List<QuestionEntity> getQuestionsBySurveyId(Long surveyId) {
        return questionRepo.findAllBySurveyId(surveyId);
    }

    @Override
    public List<QuestionEntity> saveAllQuestions(List<QuestionEntity> questionEntityList) {
        return questionRepo.saveAllAndFlush(questionEntityList);
    }
}