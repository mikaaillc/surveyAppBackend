package com.example.survey.Controller;

import com.example.survey.Entities.SurveyEntity;
import com.example.survey.Services.ISurveySevice;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/survey")//
@CrossOrigin("http://192.168.117.40:3000/")
public class SurveyController {
    private final ISurveySevice iSurveySevice;

    private SurveyController(ISurveySevice iSurveySevice) {
        this.iSurveySevice = iSurveySevice;
    }

    @GetMapping("/getAllSurvey")
    private List<SurveyEntity> getAllSurvey(){
        return iSurveySevice.getAllSurvey();
    }

    @GetMapping("/getSurveyBySurveyId")
    @ResponseBody
    private Optional<SurveyEntity> getSurveyBySurveyId(@RequestParam Long surveyId){
        return iSurveySevice.getSurveyBySurveyId(surveyId);
    }

    @PostMapping("/addSurvey")
    private Boolean saveSurvey(@RequestBody SurveyEntity newSurvey){
        return  iSurveySevice.saveSurvey(newSurvey);
    }
}
