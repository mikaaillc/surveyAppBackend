package com.example.survey.Repos;

import com.example.survey.Entities.SurveyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepo extends JpaRepository<SurveyEntity,Long> {

}
