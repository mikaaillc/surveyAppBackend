package com.example.survey.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Questions", indexes = {
        @Index(name = "fki_surveyId_fk", columnList = "surveyId")
})
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questionId", nullable = false)
    private Long id;

    @Column(name = "questionText")
    private String questionText;

    @JoinColumn(name = "surveyId", nullable = false)
    private Long surveyId ;}
