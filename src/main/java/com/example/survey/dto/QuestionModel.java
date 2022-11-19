package com.example.survey.dto;

import com.example.survey.Entities.SurveyEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class QuestionModel {

    private Long id;

    private String questionText;

    private Long surveyId;

}
