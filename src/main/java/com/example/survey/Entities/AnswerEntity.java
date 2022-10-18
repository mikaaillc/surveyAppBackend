package com.example.survey.Entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Answers")
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answerId", nullable = false)
    private Long id;

    @Column(name = "answer")
    private Boolean answer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "surveyId")
    private SurveyEntity survey;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "questionId")
    private QuestionEntity question;
}
