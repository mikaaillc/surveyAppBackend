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
@Table(name = "Survey",
        indexes = {
                @Index(name = "fki_userId_fk", columnList = "userId")})
public class SurveyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "surveyId", nullable = false)
    private Long id;


    @Column(name = "surveyName")
    private String surveyName;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "userId", nullable = false)
    private Long createdUserId;

}
