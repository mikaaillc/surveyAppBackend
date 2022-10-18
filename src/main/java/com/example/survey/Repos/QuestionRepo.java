package com.example.survey.Repos;

import com.example.survey.Entities.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepo  extends JpaRepository<QuestionEntity,Long> {

    List<QuestionEntity> findAllBySurveyId(Long surveyId);
}
