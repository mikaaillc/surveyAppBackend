package com.example.survey.Entities;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "Survey")
public class SurveyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "surveyId", nullable = false)
    private Long id;


    @Column(name = "surveyName")
    private String surveyName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "createdUserId")
    private UserEntity createdUserId;
    

}
