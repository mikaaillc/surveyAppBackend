package com.example.survey.Entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Questions")
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questionId", nullable = false)
    private Long id;

    @Column(name = "questionText")
    private String questionText;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "surveyId")
    private SurveyEntity survey;


}
