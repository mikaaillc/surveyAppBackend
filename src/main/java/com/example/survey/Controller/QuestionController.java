package com.example.survey.Controller;

import com.example.survey.Entities.QuestionEntity;
import com.example.survey.Services.IQuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://192.168.117.40:3000/")
@RequestMapping("/question")//
public class QuestionController {

    private final IQuestionService iQuestionService;

    public QuestionController(IQuestionService iQuestionService) {
        this.iQuestionService = iQuestionService;
    }

    @GetMapping("/getAllQuestions")
    @ResponseBody
    private List<QuestionEntity> getAllQuestions(@RequestParam Long surveyId){
        return iQuestionService.getQuestionsBySurveyId(surveyId);
    }
    @GetMapping("/getQuestion")
    @ResponseBody
    private Optional<QuestionEntity> getQuestionById(@RequestParam Long surveyId){
        return iQuestionService.getQuestionById(surveyId);
    }

    @PostMapping("/saveAllQuestions")
    private List<QuestionEntity> getQuestionById(@RequestBody List<QuestionEntity> questionEntityList){
        return iQuestionService.saveAllQuestions(questionEntityList);
    }

}
