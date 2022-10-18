package com.example.survey.Services;

import com.example.survey.Entities.AnswerEntity;

import java.util.List;

public interface IAnswerService {

   List<AnswerEntity> getAnswerListBySurveyId(Long Id);

    List<AnswerEntity> getAnswerListQuestionId(Long Id);

    List<AnswerEntity> saveAllQuestion(List<AnswerEntity> answerEntities);





}
