package com.group1.QuizGen.controller.rest;

import com.group1.QuizGen.model.Quiz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("rest/quiz/")
public class QuizController {

    @GetMapping("/")
    public Quiz getQuiz()
    {
        Quiz q=new Quiz();
        q.setQuizName("Test Quiz");
        return q;
    }
}
