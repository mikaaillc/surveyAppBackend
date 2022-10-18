package com.example.survey.Services;

import com.example.survey.Entities.QuestionEntity;

import java.util.List;
import java.util.Optional;

public interface IQuestionService {

    Optional<QuestionEntity> getQuestionById(Long questionId);

    List<QuestionEntity>  getQuestionsBySurveyId(Long surveyId);

    List<QuestionEntity> saveAllQuestions(List<QuestionEntity> questionEntityList);

}
