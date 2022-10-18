package com.example.survey.Services;

import com.example.survey.Entities.AnswerEntity;
import com.example.survey.Repos.AnswerRepo;

import java.util.List;

public class AnswerService implements IAnswerService{

    public AnswerRepo answerRepo;

    @Override
    public List<AnswerEntity> getAnswerListBySurveyId(Long id) {
        return answerRepo.findAllBySurveyId(id);
    }

    @Override
    public List<AnswerEntity> getAnswerListQuestionId(Long id) {
        return answerRepo.findAllByQuestionId(id);
    }

    @Override
    public List<AnswerEntity> saveAllQuestion(List<AnswerEntity> answerEntities) {
        return answerRepo.saveAllAndFlush(answerEntities);
    }
}
