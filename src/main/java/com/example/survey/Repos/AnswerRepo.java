package com.example.survey.Repos;

import com.example.survey.Entities.AnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepo extends JpaRepository<AnswerEntity,Long> {

   List<AnswerEntity> findAllBySurveyId(Long surveyId);
    List<AnswerEntity> findAllByQuestionId(Long questionId);

}
